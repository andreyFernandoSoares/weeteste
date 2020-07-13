package com.teste.weecode.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.teste.weecode.rows.UsuarioRow;
import com.teste.weecode.utils.HttpUtils;
import com.teste.weecode.ws.UsuarioWS;

@Controller
public class UsuarioController {
	
	@Autowired
	UsuarioWS userWS;
	
	@Autowired
	HttpUtils modelUtils;
	
	@PostMapping(value="/usuario")
    public String area(Model model) {
        return "usuario";
    }
	
	@PostMapping(value="/usuario/token")
	public String getTokenById(HttpServletRequest request, Model model) {
		String token = userWS.getToken(request.getParameter("id"));
		model.addAttribute("resp", token);
		return "teste";
	}
	
	@PostMapping(value="/usuario/logado")
	public ModelAndView getUsuarioLogado() {
		ModelAndView mv = new ModelAndView("usuario-teste");
		List<UsuarioRow> usuario = userWS.usuarioLogado();
		mv.addObject("usuario", usuario);
		return mv;
	}
}