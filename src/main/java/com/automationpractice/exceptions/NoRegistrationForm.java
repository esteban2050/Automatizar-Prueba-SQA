package com.automationpractice.exceptions;

/**
 * 
 * @author Juan Esteban Lopez Giraldo
 *
 */

public class NoRegistrationForm extends AssertionError{

	private static final long serialVersionUID=1L;

	public static final String NO_REGISTRATION_FORM = "You are not in the registration form";
	
	public NoRegistrationForm(String message, Throwable cause) {
		super(message, cause);
	}
}
