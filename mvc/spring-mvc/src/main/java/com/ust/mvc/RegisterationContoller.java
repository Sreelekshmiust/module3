package com.ust.mvc;

import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class RegisterationContoller {

	@PostMapping
	public String signUp(@RequestParam("userName") String userName,@RequestParam("mailId") String mailId,Model model) {
		
		
		if(userName.length() > 6 && mailId.length()>6) {
			model.addAttribute("userName",userName);
			model.addAttribute("mailId",mailId);
			//return "response";
			return "success";
		}
		else {
			return "error";
		}
	}
	public String respond(Model model) {
		
		return "response"; //view
	}
}
