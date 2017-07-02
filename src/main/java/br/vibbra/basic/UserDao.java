package br.vibbra.basic;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import br.vibbra.basic.entity.User;

@Component
public class UserDao extends AbstractDao<User> {

	@SuppressWarnings("unchecked")
	public List<User> findAll() {
		return sessionFactory.getCurrentSession().createQuery(" From User ").list();
	}

	@Override
	public Class<?> getTypeClass() {
		return User.class;
	}

	public boolean login(String email, String password) {
		Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(getTypeClass());
		criteria.add(Restrictions.eq("email", email));
		criteria.add(Restrictions.eq("password", password));
		return false;
	}
}
