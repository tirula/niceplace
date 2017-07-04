package br.vibbra.basic.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import br.vibbra.basic.entity.User;

@Component
public class UserDao extends AbstractDao<User> {

	@Override
	public Class<?> getTypeClass() {
		return User.class;
	}

	public User findByUsername(String username) {
		Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(getTypeClass());
		criteria.add(Restrictions.eq("username", username));
		return (User) criteria.uniqueResult();
	}
}
