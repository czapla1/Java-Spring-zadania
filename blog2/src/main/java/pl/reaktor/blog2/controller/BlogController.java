package pl.reaktor.blog2.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.reaktor.blog2.model.Blog;
import pl.reaktor.blog2.repository.BlogRepo;

@Controller
public class BlogController {

	private BlogRepo br;

	public BlogController(BlogRepo br) {
		super();
		this.br = br;
	}

	@PostMapping("/save")
	public String save(@ModelAttribute Blog blog) {
		br.save(blog);
		return "redirect:/";
	}
	
	
	@RequestMapping("/results")
	public String results(Model model){
		List<Blog> all= br.findAll(); 
		model.addAttribute("all", all);
		return "results";
	}

}
