package pl.reaktor.blog2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.reaktor.blog2.model.Blog;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model){
		model.addAttribute("blog", new Blog());
		return "home";
	}
}
