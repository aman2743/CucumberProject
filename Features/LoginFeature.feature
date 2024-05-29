#Author: eraman.kush@gmail.com
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
Feature: Login
Scenario: Successfull login with valid credentials
    Given User launch the chrome browser
    When User opens url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enter username as "admin@yourstore.com" and password as "admin"
    And User clicks on Login button
    Then Title should be "Dashboard / nopCommerce administration"
    When User clicks on Logout button
    Then Title should be "Your store. Login"
    And Close the browser