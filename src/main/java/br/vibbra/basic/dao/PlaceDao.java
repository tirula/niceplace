package br.vibbra.basic.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import br.vibbra.basic.entity.Place;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Component
public class PlaceDao extends AbstractDao<Place> {

	@Override
	public Class<?> getTypeClass() {
		return Place.class;
	}

	@SuppressWarnings("unchecked")
	public List<Place> findByName(String name) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(getTypeClass());
		criteria.add(Restrictions.like("%name%", name));
		return criteria.list();
	}
}
