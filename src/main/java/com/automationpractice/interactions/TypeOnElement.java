package com.automationpractice.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class TypeOnElement implements Interaction {

    private Target Obj = null;
    private String text = null;
	
	public TypeOnElement(Target locator, String text) {
		this.Obj = locator;
		this.text = text;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(text).into(this.Obj));
	}
	
	public static TypeOnElement on(Target locator, String text) {
		return instrumented(TypeOnElement.class,locator,text);
	}

}