package br.com.ufrn.agendaaluno.api.request;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GenericRequest {
	
	private String host = "https://apitestes.info.ufrn.br/";
    protected String url = "";
    private String fullAddress = "";
    protected String methodType = "GET";
	protected String requestContent = "";
    protected Map<String, String> propriedades = new HashMap<String, String>();

    public String objectRequest(){
        String strJson = "";
        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;

        try {
            URL url = new URL(getFullAddress());
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod(methodType);
			urlConnection.setRequestProperty("Content-Type", "application/json");

            
            if (propriedades != null && propriedades.size() > 0) {
				for (Entry<String, String> propriedadesEntry : propriedades.entrySet()) {
					urlConnection.setRequestProperty(propriedadesEntry.getKey(), propriedadesEntry.getValue());
				}
			}   
            
            if(requestContent != null && !requestContent.equals("")) {
				urlConnection.setDoOutput(true);
				DataOutputStream wr = new DataOutputStream(urlConnection.getOutputStream());				
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(wr, "UTF-8"));
				writer.write(requestContent);
				writer.close();
				wr.close();
				requestContent = null;
			}
            
            urlConnection.connect();
            InputStream inputStream = urlConnection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(inputStream));
            String linha;
            StringBuffer buffer = new StringBuffer();
            while((linha = reader.readLine()) != null) {
                buffer.append(linha);
                buffer.append("\n");
            }
            strJson = buffer.toString();
            if(strJson != null && strJson.length() > 0){
                return strJson;
            } else {
            	return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            return null;
        }
    }

    public String arrayRequest(){
        String strJson = "";
        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;

        try {
            URL url = new URL(getFullAddress());
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod(methodType);
            urlConnection.connect();
            InputStream inputStream = urlConnection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(inputStream));
            String linha;
            StringBuffer buffer = new StringBuffer();
            while((linha = reader.readLine()) != null) {
                buffer.append(linha);
                buffer.append("\n");
            }
            strJson = buffer.toString();
            if(strJson != null && strJson.length() > 0){
                return strJson;
            } else {
            	return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            return null;
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }


	public String getFullAddress() {
		fullAddress = getHost() + getUrl();
		return fullAddress;
	}
	
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

}
