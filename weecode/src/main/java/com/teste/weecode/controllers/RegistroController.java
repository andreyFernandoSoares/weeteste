package com.teste.weecode.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.teste.weecode.rows.RegistroRow;
import com.teste.weecode.ws.RegistroWS;

@Controller
public class RegistroController {
	
	@Autowired
	RegistroWS regWS;
	
	@PostMapping(value="/registro")
    public String indice(Model model) {
        return "registro";
    }
	
	@PostMapping(value="/registro/id")
	public ModelAndView getRegistroById(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("registro-teste");
		List<RegistroRow> registroList = regWS.getById(request.getParameter("registroId"), request.getParameter("docs"), request.getParameter("bytes"));
		mv.addObject("registros", registroList);
		return mv;
	}
	
	@PostMapping(value="/registro/area")
	public ModelAndView getRegistroByArea(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("registro-teste");
		List<RegistroRow>  registroList = regWS.getByArea(request.getParameter("areaId"), request.getParameter("registroId"), request.getParameter("docs"), request.getParameter("bytes"));
		mv.addObject("registros", registroList);
		return mv;
	}
	
	@PostMapping(value="/registro/deletar")
	public String removerRegistro(HttpServletRequest request, Model model) {
		regWS.deletarRegistro(request.getParameter("registroId"));
		model.addAttribute("resp", "Registro deletado com Sucesso!");
		return "teste";
	}
}
