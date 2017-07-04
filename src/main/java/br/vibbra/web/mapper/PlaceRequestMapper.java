package br.vibbra.web.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.vibbra.business.model.PlaceModel;
import br.vibbra.web.request.PlaceRequest;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Component
public class PlaceRequestMapper implements Mapper<PlaceModel, PlaceRequest> {

	@Autowired
	private PlaceModel model;

	@Override
	public PlaceModel map(PlaceRequest request) {
		model.setAddress(request.getAddress());
		model.setCity(request.getCity());
		model.setCountry(request.getCountry());
		model.setName(request.getName());
		model.setPhone(request.getPhone());
		model.setTypePlace(request.getTypePlace());
		return model;
	}

	@Override
	public PlaceModel getModel() {
		return model;
	}
}
