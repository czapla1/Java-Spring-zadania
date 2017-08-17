package pl.reaktor.registration1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import pl.reaktor.registration1.model.Registration;

@Controller
public class RegistrationController {

	
	@RequestMapping("/")
	public String register(){
		return "register";
	}
	
	@PostMapping("/success")
		public String success(@RequestParam() String first, @RequestParam() String last,
				@RequestParam() String email, @RequestParam() String password,
				@RequestParam(required=false, defaultValue="null") String rb, 
				@RequestParam(required=false, defaultValue="false") boolean cb1,
				@RequestParam(required=false, defaultValue="false") boolean cb2,
				@RequestParam(required=false, defaultValue="false") boolean cb3,
				Model model){
		
		if((cb1==false && cb2==false && cb3==false) || rb.equals("null")|| ((email.equals("")|| password.equals("")))){
			return "error_page";
		}else{
			Registration r = new Registration();
			model.addAttribute(r);
			return "success"; 
		}
		}
		
	
	
}
