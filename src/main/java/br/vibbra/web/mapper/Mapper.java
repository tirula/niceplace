package br.vibbra.web.mapper;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 */
public interface Mapper<K, T> {

	K map(T request);

	K getModel();

}
