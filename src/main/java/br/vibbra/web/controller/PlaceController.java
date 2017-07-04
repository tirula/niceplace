package br.vibbra.web.controller;

import org.apache.log4j.Logger;
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

	private static Logger logger = Logger.getLogger(PlaceController.class);

	@Autowired
	private PlaceService placeService;

	@RequestMapping(value = "/searchPlace", method = RequestMethod.GET)
	public ModelAndView searchPlace(PlaceRequest placeRequest) {
		logger.info("Rquisicao " + placeRequest);
		placeService.getPlaceModel().setName(placeRequest.getName());
		placeService.findByname();
		ModelAndView model = new ModelAndView("hello");
		model.addObject("places", placeService.getPlaceModel().getPlaces());
		return model;
	}

	@RequestMapping(value = "/places", method = RequestMethod.GET)
	public ModelAndView places() {
		ModelAndView model = new ModelAndView("place/home");
		placeService.retrieveAll();
		model.addObject("places", placeService.getPlaceModel().getPlaces());
		return model;
	}

	@RequestMapping(value = "/place/save", method = RequestMethod.GET)
	public ModelAndView novo(PlaceRequest placeRequest) {
		// mapper
		// salvar
		ModelAndView model = new ModelAndView("place/home");
		placeService.retrieveAll();
		model.addObject("places", placeService.getPlaceModel().getPlaces());
		return model;
	}

	@RequestMapping(value = "/place/novo", method = RequestMethod.GET)
	public ModelAndView novo() {
		ModelAndView model = new ModelAndView("place/novo");
		return model;
	}
}
