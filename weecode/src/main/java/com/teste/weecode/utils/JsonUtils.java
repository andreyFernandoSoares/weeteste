package com.teste.weecode.utils;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonUtils {
	
	public List<JSONObject> getListaJson(String json, JSONArray jsonArray){
		
		List<JSONObject> listaJson = new ArrayList<>();
		
		if ((json == null) && ((jsonArray != null) && (jsonArray.length() > 0))) {
			for (int idx = 0; idx < jsonArray.length(); idx++) 
				 listaJson.add(jsonArray.getJSONObject(idx));
		} else {
			if (json != null) {
				if (json.indexOf("[") == 0) {
					 jsonArray = new JSONArray(json);
					 for (int idx = 0; idx < jsonArray.length(); idx++) 
						 listaJson.add(jsonArray.getJSONObject(idx));
				} else {
					JSONObject jsonObject = new JSONObject(json);
					listaJson.add(jsonObject);
				}
			}
		}
		
		return listaJson;
	}
	
	public List<String> getListaString(String json){
		
		List<String> list = new ArrayList<String>();
		
		if (json.indexOf("[") == 0) {
			JSONArray jsonArray = new JSONArray(json);
			for(int idx = 0; idx < jsonArray.length(); idx++){
			    list.add(jsonArray.getString(idx));
			}
		} else {
			list.add(json);
		}
		
		return list;
	}
}
