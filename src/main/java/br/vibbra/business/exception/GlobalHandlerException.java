package br.vibbra.business.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 */
@ControllerAdvice
public class GlobalHandlerException {

	@ExceptionHandler(Exception.class)
	public ModelAndView handleAllException(Exception ex) {
		ModelAndView model = new ModelAndView("error/generic_error");
		model.addObject("errMsg", "Ocorre um erro no sistema");
		return model;
	}
}
