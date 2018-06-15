package br.com.ufrn.agendaaluno.api.dto;

import com.google.gson.Gson;

/**
 * DTO responsável por gerenciar dados de autenticação recebidos pela API do
 * SIGAA.
 * 
 * @author ramonsantos
 *
 */
public class AuthenticationDTO {

	private String access_token;
	private String token_type;
	private long expires_in;
	private String scope;

	public AuthenticationDTO() {
		super();
	}

	public AuthenticationDTO(String access_token, String token_type, long expires_in, String scope) {
		super();
		this.access_token = access_token;
		this.token_type = token_type;
		this.expires_in = expires_in;
		this.scope = scope;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getToken_type() {
		return token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public long getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(long expires_in) {
		this.expires_in = expires_in;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}

	public static AuthenticationDTO toObject(String json) {
		Gson gson = new Gson();
		return gson.fromJson(json, AuthenticationDTO.class);
	}

}
