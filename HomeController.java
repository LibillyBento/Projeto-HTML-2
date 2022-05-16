package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
	@GetMapping("/")

	public String index() {

		return "index";

	}

	@GetMapping("/signin")
	public String login() {

		return "signin";
	}

	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		model.addAttribute("nome", "Othon Campos");

		return "dashboard";
	}

	@GetMapping("/signup")
	public String cadastro() {

		return "signup";
	}
	@GetMapping("/quemsou")
	public String Quemsou() {

		return "quemsou";
	}
	
}

