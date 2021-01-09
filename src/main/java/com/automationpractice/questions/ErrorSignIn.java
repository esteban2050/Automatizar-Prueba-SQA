package com.automationpractice.questions;

import com.automationpractice.userinterfaces.SignInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class ErrorSignIn implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return Text.of(SignInPage.MSG_ERROR_CREATE_AN_ACCOUNT).viewedBy(actor).asString().contains("An account using this email address has already");
	}
	
	public static Question<Boolean> value() {
		return new ErrorSignIn();
	}
}