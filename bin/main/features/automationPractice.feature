@tag
Feature: Register on the automationpractice.com page
  I want to register on the page automation practice

  @tag1
  Scenario: Register successful
    Given I want to register, I go to the sign-in page
    When I type the email, I see the register form
      | emailAddressCreate    |
      | pruebaSQA@hotmail.com |
    And I do the registration
      | genderPI | firstNamePI | lastNamePI | emailAddressPI         | emailAddressCreate    | passwordPI | day | month | year | firstNameYA | lastNameYA | addressYA      | cityYA   | stateYA | zipCodeYA | countryYA | mobilePhoneYA | aliasAddressYA |
      |        1 | esteban     | lopez      | pruebaSQAA@hotmail.com | pruebaSQA@hotmail.com |     123456 |   5 |     5 | 1997 | esteban     | lopez      | car 39 N-65-51 | Medellin |       3 |     05003 |        21 |    3057783444 | Preferida      |
    Then I validate the name and the lastname on the home page

  @tag2
  Scenario: Wrong registration
    Given I want to register, I go to the sign-in page
    When I fill the email input and click on the button 'create an account'
      | emailAddressCreate      |
      | pruuebaSQAA@hotmail.com |
    Then I valid the error message
