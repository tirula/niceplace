package br.vibbra.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.vibbra.business.service.PlaceService;
import br.vibbra.web.request.PlaceRequest;

/**
 * @author Brunno de Almeida Santos
 */
@Controller
public class PlaceController {

	@Autowired
	private PlaceService placeService;

	@RequestMapping(value = "/searchPlace", method = RequestMethod.POST)
	public ModelAndView user(PlaceRequest placeRequest) {
		placeService.getPlaceModel().setName(placeRequest.getName());
		ModelAndView model = new ModelAndView("place/home");
		model.addObject("places", placeService.getPlaceModel().getPlaces());
		return model;
	}

}
