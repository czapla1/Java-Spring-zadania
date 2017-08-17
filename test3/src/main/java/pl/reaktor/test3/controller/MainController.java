package pl.reaktor.test3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.reaktor.test3.model.Form;

@Controller
public class MainController {

	
	
	@RequestMapping("/")
	public String form(Model model){
		return "form";
	}
	
	@RequestMapping("/results")
	public String results(@RequestParam (defaultValue="0") int age,Model model){
		if(age>=18){
			model.addAttribute(new Form());
			return "results";
		}else return "redirect:failed";
	}
	
	@RequestMapping("/failed")
	public String failed(){
		return "failed";
	}
}
