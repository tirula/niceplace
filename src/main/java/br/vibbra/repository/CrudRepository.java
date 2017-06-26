package br.vibbra.repository;

import java.io.Serializable;

import org.springframework.data.repository.Repository;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 * @param <T>
 * @param <ID>
 */
public interface CrudRepository<T, ID extends Serializable> extends Repository<T, ID> {

	<S extends T> S save(S entity);

	T findOne(ID primaryKey);

	Iterable<T> findAll();

	Long count();

	void delete(T entity);

	boolean exists(ID primaryKey);

}