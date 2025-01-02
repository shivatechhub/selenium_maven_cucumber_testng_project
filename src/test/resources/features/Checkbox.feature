@checkbox @all
Feature: Checkbox functionality

  Scenario Outline: validate the form checkbox functionality
    Given I navigate to test checkbox <url>
    When I checked that checkbox is selected and validate the message
    Then checkbox is not selected validate the message

  Examples: 
    | url                                                                     | 
    | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login         |