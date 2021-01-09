package com.automationpractice.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.automationpractice.interactions.TypeOnElement;
import com.automationpractice.models.RegisterModel;
import com.automationpractice.userinterfaces.RegisterPage;
import com.automationpractice.utils.ConstantGeneral;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task{
		
	RegisterModel registerModel;
	
	public Register(RegisterModel registerModel) {
		this.registerModel = registerModel;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			if(registerModel.getGenderPI() == 0) {
				actor.attemptsTo(Click.on(RegisterPage.RB_FEMALE));
			}else if(registerModel.getGenderPI() == 1){
				actor.attemptsTo(Click.on(RegisterPage.RB_MALE));
			}
			actor.attemptsTo(TypeOnElement.on(RegisterPage.TXT_FIRST_NAME_PI, registerModel.getFirstNamePI()),
					         TypeOnElement.on(RegisterPage.TXT_LAST_NAME_PI, registerModel.getLastNamePI()),
					         TypeOnElement.on(RegisterPage.TXT_EMAIL_PI, registerModel.getEmailAddressPI()),
					         TypeOnElement.on(RegisterPage.TXT_PASSWORD_PI, registerModel.getPasswordPI()),
					         SelectFromOptions.byValue(registerModel.getDay()).from(RegisterPage.LT_DAY),
					         SelectFromOptions.byValue(registerModel.getMonth()).from(RegisterPage.LT_MONTH),
					         SelectFromOptions.byValue(registerModel.getYear()).from(RegisterPage.LT_YEAR),
					         Scroll.to(RegisterPage.TXT_FIRST_NAME_YA).andAlignToTop(),
					         TypeOnElement.on(RegisterPage.TXT_FIRST_NAME_YA, registerModel.getFirstNameYA()),
					         TypeOnElement.on(RegisterPage.TXT_LAST_NAME_YA, registerModel.getLastNameYA()),
					         TypeOnElement.on(RegisterPage.TXT_ADDRESS_YA, registerModel.getAddressYA()),
					         TypeOnElement.on(RegisterPage.TXT_CITY_YA, registerModel.getCityYA()),
					         SelectFromOptions.byValue(registerModel.getStateYA()).from(RegisterPage.LT_STATE),
					         TypeOnElement.on(RegisterPage.TXT_ZIP_YA, registerModel.getZipCodeYA()),
					         SelectFromOptions.byValue(registerModel.getCountryYA()).from(RegisterPage.LT_COUNTRY),
					         TypeOnElement.on(RegisterPage.TXT_MOBILE_YA, registerModel.getMobilePhoneYA()),
					         TypeOnElement.on(RegisterPage.TXT_ALIAS_ADDRESS_YA, registerModel.getAliasAddressYA()),
					         Scroll.to(RegisterPage.BTN_REGISTER).andAlignToBottom(),
					         Click.on(RegisterPage.BTN_REGISTER));
			actor.remember(ConstantGeneral.FULL_NAME_QUESTION, registerModel.getFirstNamePI()+" "+ registerModel.getLastNamePI());
			
		} catch (Exception e) {
			System.out.println("No es un numero valido; error: " + e);
		}
		
	}
	
	public static Register with(RegisterModel registerModel) {
		return instrumented(Register.class,registerModel);
	}

}