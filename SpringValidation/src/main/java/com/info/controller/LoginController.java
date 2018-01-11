package com.info.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.info.model.Login;

@Controller
public class LoginController {
     
	@RequestMapping(value={"/", "index"} , method=RequestMethod.GET)
	public String show(Model model)
	{
		model.addAttribute("userForm", new Login());
		return "index";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST )
	public String display(@Valid @ModelAttribute("userForm") Login log, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "index";
		}
		else
		{
			return "login";
		}
	}
}
