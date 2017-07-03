package br.vibbra.business.exception;

import org.apache.log4j.Logger;
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

	private Logger logger = Logger.getLogger(GlobalHandlerException.class);

	@ExceptionHandler(Exception.class)
	public ModelAndView handleAllException(Exception ex) {
		logger.error(ex);
		ModelAndView model = new ModelAndView("error/generic_error");
		model.addObject("errMsg", "Ocorre um erro no sistema");
		return model;
	}
}
