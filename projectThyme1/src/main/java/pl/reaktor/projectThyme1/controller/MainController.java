package pl.reaktor.projectThyme1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.reaktor.projectThyme1.model.Article;

@Controller
public class MainController {
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("art", new Article());
		return "home";
	}
}
