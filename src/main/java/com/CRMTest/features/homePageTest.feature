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
Feature: Test free CRM home page

  @tag1
  Scenario: validate login functionality
    Given I open a brower
    When I go to CRM web site
    And I see CRM logo
    And I see forgot password link
    And I see features link
    And I see Signup link
    And I see Pricing link
    And I see Customers link
    And I see Contact link
    When I enter username and password
    And I click Login button
    Then I should see login page title
    And I close the brower
