package com.automationpractice.questions;

import com.automationpractice.userinterfaces.RegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class FullName implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return RegisterPage.NAME_COMPLETE.resolveFor(actor).getText();
	}
	
	public static Question<String> value() {
		return new FullName();
	}
}