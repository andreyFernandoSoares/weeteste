package com.teste.weecode.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.teste.weecode.rows.TarefaRow;
import com.teste.weecode.ws.WorkFlowWS;

@Controller
public class WorkFlowController {
	
	@Autowired
	WorkFlowWS wfWS;
	
	@PostMapping(value="/workflow")
    public String workflow(Model model) {
        return "workflow";
    }
	
	@PostMapping(value="/workflow/usuario")
	public ModelAndView getTarefaUsuario(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("workflow-teste");
		List<TarefaRow> listaTarefa = wfWS.getTarefaUsuario(request.getParameter("usuarioId"));
		mv.addObject("tarefas", listaTarefa);
		return mv;
	}
	
}
