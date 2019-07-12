
@tag
Feature: To add Customer
 
  @tag1
  Scenario: To add Customer
    Given The user should be telecom homepage and click the Add Customer
    When The user should provide valid details
    |fname | ruby |
    |lname | sherly |
    |email | rubysherly@gmail.com |
    |address | chennai |
    |phone | 9791252580|
    Then The user should validate the Customer ID
