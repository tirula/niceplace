package br.vibbra.basic.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
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

	@SuppressWarnings("unchecked")
	public List<UserPlace> findAllByUser(String username) {
		Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(getTypeClass());
		criteria.add(Restrictions.eq("pk.user.username", username));
		return criteria.list();
	}

}
