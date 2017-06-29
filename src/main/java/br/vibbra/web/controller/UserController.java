package br.vibbra.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.vibbra.business.service.UserService;
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

	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public String login(UserRequest user) {
		logger.info("Efetuando login para : " + user);
		return "user/home";
	}

	@RequestMapping("/users")
	public String users() {
		userService.retrieveAll();
		return "user/list";
	}
}
