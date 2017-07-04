package br.vibbra.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.vibbra.business.model.UserPlaceModel;
import br.vibbra.business.service.PlaceService;
import br.vibbra.business.service.UserPlaceService;
import br.vibbra.web.mapper.Mapper;
import br.vibbra.web.request.RatingRequest;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Controller
public class RatingController {

	@Autowired
	private UserPlaceService userPlaceService;

	@Autowired
	private PlaceService placeService;

	@Autowired
	private Mapper<UserPlaceModel, RatingRequest> ratingMapper;

	@RequestMapping(value = "/ratings", method = RequestMethod.GET)
	public ModelAndView ratings() {
		ModelAndView model = new ModelAndView("ratings/home");
		userPlaceService.retrieveAll();
		model.addObject("userPlaces", userPlaceService.getUserPlaceModel().getUserPlaces());
		return model;
	}

	@RequestMapping(value = "/rate", method = RequestMethod.GET)
	public ModelAndView rate() {
		ModelAndView model = new ModelAndView("ratings/rate");
		placeService.retrieveAll();
		model.addObject("places", placeService.getPlaceModel().getPlaces());
		return model;
	}

	@RequestMapping(value = "/rate/new", method = RequestMethod.GET)
	public ModelAndView rateNew(RatingRequest ratingRequest) {
		ModelAndView model = new ModelAndView("ratings/home");
		UserPlaceModel userPlaceModel = ratingMapper.map(ratingRequest);
		userPlaceService.setUserPlaceModel(userPlaceModel);
		userPlaceService.rating();
		placeService.retrieveAll();
		model.addObject("places", placeService.getPlaceModel().getPlaces());
		return model;
	}

}
