package br.vibbra.web.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import br.vibbra.business.model.UserPlaceModel;
import br.vibbra.web.request.RatingRequest;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Component
public class RatingMapper implements Mapper<UserPlaceModel, RatingRequest> {

	@Autowired
	private UserPlaceModel model;

	@Override
	public UserPlaceModel map(RatingRequest request) {
		model.setUsername(getPrincipal());
		model.setBill(request.getBill());
		model.setConfortable(request.getConfortable());
		model.setDrinks(request.getDrinks());
		model.setFoods(request.getFoods());
		model.setNoisy(request.getNoisy());
		model.setPlaceID(request.getPlaceID());
		model.setTotal(request.getTotal());
		model.setWaiter(request.getWaiter());
		// internet
		return model;
	}

	@Override
	public UserPlaceModel getModel() {
		return model;
	}

	private String getPrincipal() {
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			userName = ((UserDetails) principal).getUsername();
		} else {
			userName = principal.toString();
		}
		return userName;
	}
}
