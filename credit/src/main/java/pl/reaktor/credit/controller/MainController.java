package pl.reaktor.credit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.reaktor.credit.model.Credit;

@Controller
public class MainController {

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("credit", new Credit());
		return "home";

	}

	@PostMapping("/result")
	public String result(@ModelAttribute Credit credit, Model model) {
		model.addAttribute("credit", credit);
		return "result";
	}
}
