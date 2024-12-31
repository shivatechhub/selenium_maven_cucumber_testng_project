@formauthentication @all
Feature: Form Authentication functionality

  Scenario Outline: validate the form authentication functionality
    Given I navigate to the <url>
    When I click on form authentication and enter <username> and <password>
    Then validate login successful

  Examples: 
    | url                                         | username        | password             |
    | https://the-internet.herokuapp.com/         | tomsmith        | SuperSecretPassword! |