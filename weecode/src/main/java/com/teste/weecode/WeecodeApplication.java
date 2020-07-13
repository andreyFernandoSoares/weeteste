package com.teste.weecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.teste.weecode.dao.GediDAO;
import com.teste.weecode.utils.DateUtils;
import com.teste.weecode.utils.HttpUtils;
import com.teste.weecode.utils.JsonUtils;
import com.teste.weecode.ws.AreaWS;
import com.teste.weecode.ws.AuxiliarWS;
import com.teste.weecode.ws.DocumentoWS;
import com.teste.weecode.ws.IndiceWS;
import com.teste.weecode.ws.RegistroWS;
import com.teste.weecode.ws.UsuarioWS;
import com.teste.weecode.ws.WorkFlowWS;

@SpringBootApplication
@ComponentScan({"com.teste.weecode.controllers"})
public class WeecodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeecodeApplication.class, args);
	}
	
	@Bean
	public AreaWS areaWS() {
		return new AreaWS();
	}
	
	@Bean
	public UsuarioWS userWS() {
		return new UsuarioWS();
	}
	
	@Bean
	public RegistroWS regWS() {
		return new RegistroWS();
	}
	
	@Bean
	public WorkFlowWS wfWS() {
	    return new WorkFlowWS();
	}
	
	@Bean
	public DocumentoWS docWS() {
		return new DocumentoWS();
	}
	
	@Bean
	public IndiceWS indWS() {
		return new IndiceWS();
	}
	
	@Bean
	public AuxiliarWS auxWS() {
		return new AuxiliarWS();
	}
	
	@Bean
	public JsonUtils jsonUtils() {
		return new JsonUtils();
	}
	
	@Bean
	public HttpUtils modelUtils() {
		return new HttpUtils();
	}
	
	@Bean
	public DateUtils dateUtils() {
		return new DateUtils();
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	@Bean
	public GediDAO gediDAO() {
	    return new GediDAO();
	}
}
