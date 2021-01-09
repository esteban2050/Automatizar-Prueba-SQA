package com.automationpractice.questions;

import java.util.List;

import com.automationpractice.userinterfaces.RegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class RegistrationForm implements Question<List<String>>{

	@Override
	public List<String> answeredBy(Actor actor) {
		return Text.of(RegisterPage.TITLE_PERSONAL_INFORMATION).
				viewedBy(actor).asList();
	}
	
	public static Question<List<String>> isDisplayed() {
		return new RegistrationForm();
	}
}