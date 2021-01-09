package com.automationpractice.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class SignInPage{

	// INPUT
	public static final Target TXT_EMAIL_ADDRESS = Target.the("Input to the email address")
			.located(By.id("email_create"));

	// MESSAGE
	public static final Target MSG_ERROR_CREATE_AN_ACCOUNT = Target.the("Error message to create an existing account")
			.located(By.id("create_account_error"));

	// BUTTON
	public static final Target BTN_CREATE_AN_ACCOUNT = Target.the("Button to create an account")
			.located(By.id("SubmitCreate"));
	public static final Target BTN_SIGN_IN = Target.the("Button to sign-in on the page")
			.located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));

}
