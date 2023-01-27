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
@tag
Feature: Hotelapp Login feature
  this feature is for taking login functionality of the hotel app 

  
  Scenario: Successfull login with valid credentials
    Given when user is on the login page 
    When user enters "Jayakishore","Test@12345" 
    And user clicks on login button 
    Then Login is successfull
    And Search hotel page is displayed

  