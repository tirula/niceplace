package br.vibbra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Controller
public class UserController {

	@RequestMapping("/users")
	public String users() {
		System.out.println("aaaaaa");
		return "user/home";
	}

}
