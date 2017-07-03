package br.vibbra.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.vibbra.basic.dao.PlaceDao;
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

	@Autowired
	private PlaceDao placeDao;

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public ModelAndView user(UserRequest userRequest) {
		userMapper.map(userRequest);
		userService.setUserModel(userMapper.getModel());
		userService.save();
		userService.retrieveAll();
		ModelAndView model = new ModelAndView("user/home");
		model.addObject("users", userService.getUserModel().getUsers());
		return model;
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView user() {
		placeDao.findAll();
		ModelAndView model = new ModelAndView("user/home");
		userService.retrieveAll();
		model.addObject("users", userService.getUserModel().getUsers());
		return model;
	}

	@RequestMapping(value = "/user/remove/{id}", method = RequestMethod.GET)
	public ModelAndView remove(Long id) {
		userService.getUserModel().setId(id);
		ModelAndView model = new ModelAndView("user/home");
		userService.retrieveAll();
		model.addObject("users", userService.getUserModel().getUsers());
		return model;
	}
}
