package com.automationpractice.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.automationpractice.exceptions.NoRegistrationForm;
import com.automationpractice.interactions.OpenBrowser;
import com.automationpractice.models.RegisterModel;
import com.automationpractice.questions.ErrorSignIn;
import com.automationpractice.questions.FullName;
import com.automationpractice.questions.RegistrationForm;
import com.automationpractice.task.Register;
import com.automationpractice.task.SignIn;
import com.automationpractice.userinterfaces.AutomationPracticePage;
import com.automationpractice.utils.ConstantGeneral;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AutomationStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;	
	private Actor Esteban = Actor.named("Esteban");	
	AutomationPracticePage automationPracticePage;
	
	@Before
	public void setUp() 
	{				
		Esteban.can(BrowseTheWeb.with(hisBrowser));		
		hisBrowser.manage().window().maximize();
	}

	@Given("^I want to register, I go to the sign-in page$")
	public void i_want_to_register_I_go_to_the_sign_in_page() {
		Esteban.wasAbleTo(OpenBrowser.on(automationPracticePage)); 
	}
	
	@When("^I type the email, I see the register form$")
	public void i_type_the_email_i_see_the_register_form(List<RegisterModel> registerModel) {
		Esteban.wasAbleTo(SignIn.with(registerModel.get(0)));
		Esteban.should(seeThat(RegistrationForm.isDisplayed(), 
				hasItem("YOUR PERSONAL INFORMATION")).orComplainWith(NoRegistrationForm.class, NoRegistrationForm.NO_REGISTRATION_FORM));
	}

	@And("^I do the registration$")
	public void i_do_the_registration(List<RegisterModel> registerModel) {
		Esteban.wasAbleTo(Register.with(registerModel.get(0)));
	}

	@Then("^I validate the name and the lastname on the home page$")
	public void i_validate_the_name_and_the_lastname_on_the_home_page() {
		Esteban.should(seeThat(FullName.value(), equalTo(Esteban.recall(ConstantGeneral.FULL_NAME_QUESTION.trim()))));
	}

	@When("^I fill the email input and click on the button 'create an account'$")
	public void i_fill_the_email_input_and_click_on_the_button_create_an_account(List<RegisterModel> registerModel) {
	    Esteban.attemptsTo(SignIn.with(registerModel.get(0)));
	}

	@Then("^I valid the error message$")
	public void i_valid_the_error_message() {
		Esteban.should(seeThat(ErrorSignIn.value()));
	}
}