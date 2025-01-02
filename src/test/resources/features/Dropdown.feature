
@Dropdown @all
Feature: Dropdown functionality

 # I want to use this template for my feature file

  Scenario Outline: validate the form dropdown functionality
    Given I navigate to only testing <url>
    When I select a <value> from the dropdown
    Then I validate if the selected value is populated
    

  

    Examples: 
      | url                                                      |  value     |
      | https://only-testing-blog.blogspot.com/2013/09/test.html |  Singapore |
     