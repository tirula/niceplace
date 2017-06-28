package br.vibbra.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.vibbra.web.request.UserRequest;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Controller
public class UserController {

	private static Logger logger = Logger.getLogger(UserController.class);

	@RequestMapping("/login")
	public String login(UserRequest user) {
		logger.info("Efetuando login para : " + user);

		return "user/home";
	}

	@RequestMapping("/users")
	public String users() {
		System.out.println("aaaaaa");
		return "user/list";
	}

}
