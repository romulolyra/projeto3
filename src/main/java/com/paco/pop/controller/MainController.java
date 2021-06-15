package com.paco.pop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String login() {
		return "login";
	}

	@RequestMapping("/planejamento-trefila")
	public String planejamentoTrefila() {
		return "planejamento_trefila";
	}

	@RequestMapping("/planejamento-mensal")
	public String planejamentoMensal() {
		return "planejamento_mensal";
	}

	@RequestMapping("/planejamento-dia")
	public String planejamentoDiario() {
		return "planejamento_dia";
	}
}
