package br.vibbra.business.exception;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 */
public class SignInException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5850116613875321210L;

	public SignInException(String message) {
		super(message);
	}

	public SignInException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public SignInException(Throwable throwable, String message) {
		super(message, throwable);
	}

	public SignInException(Throwable throwable) {
		super(throwable);
	}

}
