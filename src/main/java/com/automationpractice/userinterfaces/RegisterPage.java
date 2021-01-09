package com.automationpractice.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

	// INPUT	
	public static final Target TXT_FIRST_NAME_PI = Target.the("Input to the first name in your personal information section")
			.located(By.id("customer_firstname"));
	public static final Target TXT_LAST_NAME_PI = Target.the("Input to the last name in your personal information section")
			.located(By.id("customer_lastname"));
	public static final Target TXT_EMAIL_PI = Target.the("Input to the email address in your personal information section")
			.located(By.id("email"));
	public static final Target TXT_PASSWORD_PI = Target.the("Input to the password in your personal information section")
			.located(By.id("passwd"));
	public static final Target TXT_FIRST_NAME_YA = Target.the("Input to the first name in your address section")
			.located(By.id("firstname"));
	public static final Target TXT_LAST_NAME_YA = Target.the("Input to the last name in your address section")
			.located(By.id("lastname"));
	public static final Target TXT_ADDRESS_YA = Target.the("Input to the address in your address section")
			.located(By.id("address1"));
	public static final Target TXT_CITY_YA = Target.the("Input to the city in your address section")
			.located(By.id("city"));
	public static final Target TXT_ZIP_YA = Target.the("Input to the zip/code postal in your address section")
			.located(By.id("postcode"));
	public static final Target TXT_MOBILE_YA = Target.the("Input to the mobile in your address section")
			.located(By.id("phone_mobile"));
	public static final Target TXT_ALIAS_ADDRESS_YA = Target.the("Input to the address alias in your address section")
			.located(By.id("alias"));

	//LIST BOX
	public static final Target LT_DAY = Target.the("List box to the day of the birth")
			.located(By.id("days"));
	public static final Target LT_MONTH = Target.the("List box to the month of the birth")
			.located(By.id("months"));
	public static final Target LT_YEAR = Target.the("List box to the year of the birth")
			.located(By.id("years"));
	public static final Target LT_STATE = Target.the("List box to the state")
			.located(By.id("id_state"));
	public static final Target LT_COUNTRY = Target.the("List box to the country")
			.located(By.id("id_country"));
	
	//RADIOBUTTON
	public static final Target RB_MALE = Target.the("Radio button to male")
			.located(By.id("id_gender1"));
	public static final Target RB_FEMALE = Target.the("Radio button to female")
			.located(By.id("id_gender2"));
	
	// BUTTON
	public static final Target BTN_REGISTER = Target.the("Button to register")
			.located(By.xpath("//*[@id=\"submitAccount\"]/span"));

	//TEXT 
	public static final Target NAME_COMPLETE = Target.the("The tittle of the new account")
			.located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
	
	public static final Target TITLE_PERSONAL_INFORMATION = Target.the("The tittle of your personal information")
			.located(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/h3"));
}