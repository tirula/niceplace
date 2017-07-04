package br.vibbra.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.vibbra.business.model.UserModel;
import br.vibbra.business.service.UserService;
import br.vibbra.web.mapper.Mapper;
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
	private Mapper<UserModel, UserRequest> userMapper;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public void save(UserRequest userRequest) {
		userMapper.map(userRequest);
		userService.setUserModel(userMapper.getModel());
		userService.save();
	}

	@RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
	public ModelAndView cadastrar() {
		logger.info("cadastrar");
		ModelAndView model = new ModelAndView("user/cadastrar");
		return model;

	}

}
