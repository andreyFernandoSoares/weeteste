package com.teste.weecode.dao;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class GedDAO {
	
	@Autowired
    RestTemplate restTemplate;
	
	public String post(String url, HttpEntity<Object> entidade) {
		try {
			ResponseEntity<String> resp = restTemplate.postForEntity(url, entidade, String.class);
			return resp.getBody();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}
	
	public Integer delete(String url, HttpEntity<Object> entidade, HashMap<String, Object> params) {
		try {
			ResponseEntity<String> resp = restTemplate.exchange(url, HttpMethod.DELETE, entidade, String.class, params);
			return resp.getStatusCodeValue();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}
	
	public Integer put(String url, HttpEntity<Object> entidade, HashMap<String, Object> params) {
		try {
			ResponseEntity<String> resp = restTemplate.exchange(url, HttpMethod.PUT, entidade, String.class, (String) params.get("id"));
			return resp.getStatusCodeValue();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}
	
	public String get(String url, HttpEntity<Object> entidade, HashMap<String, Object> params) {
		try {
			 ResponseEntity<String> resp = restTemplate.exchange(url, HttpMethod.GET, entidade, String.class, params);
			 return resp.getBody();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}
}
