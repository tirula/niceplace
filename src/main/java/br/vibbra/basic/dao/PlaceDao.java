package br.vibbra.basic.dao;

import org.springframework.stereotype.Component;

import br.vibbra.basic.entity.Place;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Component
public class PlaceDao extends AbstractDao<PlaceDao> {

	@Override
	public Class<?> getTypeClass() {
		return Place.class;
	}
}
