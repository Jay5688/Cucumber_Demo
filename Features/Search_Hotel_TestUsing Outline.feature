#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Search the Hotel app in Addactin app
  I want to use this test the search fuctionality of addactin app


  Scenario Outline: Search results displayupon filling mandatory values
    Given when user is on the login page 
    When user enters "<username>","<password>" 
    And user clicks on login button 
    And Login is successfull
    And Search hotel page is displayed
    And User selects the "<location>", "<rooms>", "<checkin>", "<checkout>", "<adults>"
    And User clicks on search 
    Then Search results should be displayed 

    Examples: 
      | username | password | location | rooms | checkin | checkout | adults |
      | Jayakishore | Test@12345 | Sydney | 1 - One | 23/01/2023 | 30/01/2023 | 2 - Two |
      | vasuvespag | vasu1234 | Melbourne | 2 - Two | 23/01/2023 | 29/01/2023 | 1 - One |
      
      
      
      
      