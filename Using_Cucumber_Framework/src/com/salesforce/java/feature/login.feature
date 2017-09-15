Feature: Logging into Salesforce

In order to work
As a sales person
I want to login

Scenario: Logging in Salesforce

Given I go to "url" on "Mozilla"
And I enter "username_element" as "username"
And I enter "password_element" as "password"
And I click on "login" button
Then Login should be "Success"

