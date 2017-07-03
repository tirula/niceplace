package br.vibbra.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.vibbra.web.request.UserRequest;

/**
 * @author Brunno de Almeida Santos
 */
@Controller
public class PlaceController {

	@RequestMapping(value = "/places", method = RequestMethod.POST)
	public ModelAndView user(UserRequest userRequest) {
		return null;
	}

}
