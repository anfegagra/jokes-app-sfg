package com.chucknorris.app.controllers;

import com.chucknorris.app.services.ChuckNorrisService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

	private ChuckNorrisService chuckNorrisService;

	public JokesController(ChuckNorrisService chuckNorrisService) {
		this.chuckNorrisService = chuckNorrisService;
	}

	@GetMapping({"/", ""})
	public String showJoke(Model model) {
		model.addAttribute("joke", chuckNorrisService.getJoke());
		return "chucknorris";
	}

}
