package com.automationpractice.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.automationpractice.models.RegisterModel;
import com.automationpractice.userinterfaces.SignInPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SignIn  implements Task{
	
	RegisterModel registerModel;
	
	public SignIn(RegisterModel registerModel) {
		this.registerModel = registerModel;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {				
		try {
			actor.wasAbleTo(Click.on(SignInPage.BTN_SIGN_IN),
			        Enter.theValue(registerModel.getEmailAddressCreate()).into(SignInPage.TXT_EMAIL_ADDRESS),
			        Click.on(SignInPage.BTN_CREATE_AN_ACCOUNT));
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public static SignIn with(RegisterModel registerModel) {
		return instrumented(SignIn.class, registerModel);
	}

}