package br.com.ufrn.agendaaluno.api.dto;

import com.google.gson.Gson;

/**
 * DTO genérico.
 * 
 * @author ramonsantos
 *
 */
public abstract class GenericDTO {

	/**
	 * Método para tratar jsons
	 * 
	 * @param json
	 * @return String
	 */
	public static String trataJson(String json) {
		if (json.contains("-")) {
			return json.replace("-", "_");
		} else {
			return json;
		}
	}

	/**
	 * Método genérico para converter json em um objeto
	 * 
	 * @param json
	 * @param classe
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T toObject(String json, Class<T> classe) {
		Gson gson = new Gson();

		if (json.startsWith("[")) {
			T[] ts = (T[]) new Object[0];
			T[] studentArray = (T[]) toArrayObject(json, ts.getClass());
			if (studentArray != null && studentArray.length == 1) {
				return (T) studentArray[0];
			} else {
				return null;
			}
		} else {
			return (T) gson.fromJson(trataJson(json), classe);
		}
	}

	/**
	 * Método genérico para converter um json em um array de objetos
	 * 
	 * @param json
	 * @param classe
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T[] toArrayObject(String json, Class<T> classe) {
		Gson gson = new Gson();
		json = trataJson(json);
		return (T[]) gson.fromJson(json, classe);
	}
}
