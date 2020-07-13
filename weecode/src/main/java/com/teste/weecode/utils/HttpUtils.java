package com.teste.weecode.utils;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class HttpUtils {
	
	private static final String COOKIE = "CXSSID=NzV8OnxhbmRyZXkuc29hcmVzfDp8LTF8OnwyNjNmYjk0MTVkMDA1NTkzNWE2OTU3YjZiMjQxOWVjZHw6fGY3Yjg1ODE4ZTk3MDRiYTMwNDhiNzI3NzEzODM0OGJmOGRmMjYxYTQ";
	
	public HttpEntity<Object> entidadeHttp(Object tipo, MediaType contentType){
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(contentType);
		headers.set("Cookie", COOKIE);
		return new HttpEntity<>(tipo, headers);
	}
}







