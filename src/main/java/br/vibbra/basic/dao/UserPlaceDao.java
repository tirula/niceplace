package br.vibbra.basic.dao;

import org.springframework.stereotype.Component;

import br.vibbra.basic.entity.UserPlace;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Component
public class UserPlaceDao extends AbstractDao<UserPlace> {

	@Override
	public Class<?> getTypeClass() {
		return UserPlace.class;
	}

}
