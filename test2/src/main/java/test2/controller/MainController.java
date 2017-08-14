package test2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String home(){
		return "home";
	}
	@RequestMapping("/next")
	public String next(Model model){
		model.addAttribute("mess", "Tajna wiadomosc");
		return "next";
	}
	
	@RequestMapping("/show")
	public String show(){
		return "show";
	}
	
}
