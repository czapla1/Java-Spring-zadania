package pl.reaktor.projectThyme1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pl.reaktor.projectThyme1.model.Article;

@Controller
public class ArticleController {
	@PostMapping("/posty")
	public String posty(@ModelAttribute Article art,Model model){
		model.addAttribute("art",art);
		return "posty";
	}

}
