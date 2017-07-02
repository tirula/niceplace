package br.vibbra.basic;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
public abstract class AbstractDao<T> {

	@Autowired
	protected SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public T save(T entity) {
		return (T) this.sessionFactory.getCurrentSession().save(entity);
	}

	public void delete(T entity) {
		this.sessionFactory.getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public T update(T entity) {
		return (T) this.sessionFactory.getCurrentSession().merge(entity);
	}

	@SuppressWarnings("unchecked")
	public T getById(Object id) {
		Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(getTypeClass());
		criteria.add(Restrictions.eq("id", id));
		return (T) criteria.uniqueResult();
	}

	public abstract Class<?> getTypeClass();

}
