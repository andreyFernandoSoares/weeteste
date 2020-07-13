package com.teste.weecode.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.teste.weecode.rows.AreaRow;
import com.teste.weecode.ws.IndiceWS;


@Controller
public class IndiceController {
	
	@Autowired
	IndiceWS indWS;
	
	@PostMapping(value="/indice")
    public String indice(Model model) {
        return "indice";
    }
	
	@PostMapping(value="/indice/identificador")
	public ModelAndView getIndiceByIdentificador(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("area-teste");
		List<AreaRow> areaList = indWS.getByIdentificador(request.getParameter("areaId"), request.getParameter("identificador"), request.getParameter("localizacao"));
		mv.addObject("areas", areaList);
		return mv;
	}
	
	@PostMapping(value="/indice/usuario")
	public ModelAndView getIndiceByUsuario(HttpServletRequest request, Model model) {
		ModelAndView mv = new ModelAndView("area-teste");
		List<AreaRow> areaList = indWS.getByUsuario(request.getParameter("identificador"), request.getParameter("usuarioId"));
		mv.addObject("areas", areaList);
		return mv;
	}
}
