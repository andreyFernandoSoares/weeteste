package com.teste.weecode.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.teste.weecode.rows.AreaRow;
import com.teste.weecode.ws.AreaWS;

@Controller
public class AreaController {
	
	@Autowired
	AreaWS areaWS;
	
	@PostMapping(value="/area")
    public String area(Model model) {
        return "area";
    }
	
	@PostMapping(value="/area/id")
	public String getAreaByName(HttpServletRequest request, Model model) {
		String id = (String) areaWS.getId(request.getParameter("nome"));
		model.addAttribute("resp", "Id: "+ id);
		return "teste";
	}
	
	@PostMapping(value="/area/nome")
	public String getAreaById(HttpServletRequest request, Model model) {
		String nome = areaWS.getNome(request.getParameter("id"));
		model.addAttribute("resp", "Nome: "+nome);
		return "teste";
	}
	
	@PostMapping(value="/area/criar")
	public String persistirArea(HttpServletRequest request, Model model) {
		String id = areaWS.criarArea("{\"nome\":\""+request.getParameter("nome")+"\"}");
		model.addAttribute("resp", "Criado com Sucesso! Id: "+id);
		return "teste";
	}
	
	@PostMapping(value="/area/deletar")
	public String removerArea(HttpServletRequest request, Model model) {
		String resposta = areaWS.deletarArea(request.getParameter("id"), request.getParameter("definitivo"));
		model.addAttribute("resp", resposta);
		return "teste";
	}
	
	@PostMapping(value="/area/mover")
	public String moverArea(HttpServletRequest request, Model model) {
		String resposta = areaWS.moverArea(request.getParameter("id"), request.getParameter("idPai"));
		model.addAttribute("resp", resposta);
		return "teste";
	}
	
	@PostMapping(value="/area/documento")
	public String getDocumentosArea(HttpServletRequest request, Model model) {
		String noDocumentos = areaWS.getDocumentosArea(request.getParameter("id"));
		model.addAttribute("resp", "O numero de documentos da area é: "+noDocumentos);
		return "teste";
	}
	
	@PostMapping(value="/area/pai")
	public String getAreaPai(HttpServletRequest request, Model model) {
		String areaPai = areaWS.getPaiArea(request.getParameter("id"));
		model.addAttribute("resp", "A area pai é: "+areaPai);
		return "teste";
	}
	
	@PostMapping(value="/area/temporalidade")
	public ModelAndView getAreaTemporalidade(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("area-teste");
		List<AreaRow> areaList = areaWS.listaTemporalidade();
		mv.addObject("areas", areaList);
		return mv;
	}
}