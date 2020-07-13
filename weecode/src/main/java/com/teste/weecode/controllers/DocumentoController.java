package com.teste.weecode.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.teste.weecode.rows.DocumentoRow;
import com.teste.weecode.ws.DocumentoWS;

@Controller
public class DocumentoController {

	@Autowired
	DocumentoWS docWS;

	@PostMapping(value="/documento")
    public String documento(Model model) {
        return "documento";
    }
	
	@PostMapping(value="/documento/id")
	public ModelAndView getDocumentoById(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("documento-teste");
		List<DocumentoRow> documentoList = docWS.getById(request.getParameter("documentoId"), request.getParameter("bytes"));
		mv.addObject("documentos", documentoList);
		return mv;
	}
	
	@PostMapping(value="/documento/deletar")
	public String removerDocumento(HttpServletRequest request, Model model) {
		String resposta = docWS.deletarDocumento(request.getParameter("documentoId"));
		model.addAttribute("resp", resposta);
		return "teste";
	}
	
	@PostMapping(value="/documento/mover")
	public String moverDocumento(HttpServletRequest request, Model model) {
		String resposta = docWS.moverDocumento(request.getParameter("documentoId"), request.getParameter("registroId"));
		model.addAttribute("resp", resposta);
		return "teste";
	}
	
	@PostMapping(value="/documento/pesquisa")
	public ModelAndView pesquisaDocumento(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("documento-teste");
		List<DocumentoRow> documentoList = docWS.pesquisaJson(request.getParameter("jsonPesquisa"));
		mv.addObject("documentos", documentoList);
		return mv;
	}
}
