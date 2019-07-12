
@tag
Feature: To add Customer
 
  @tag1
  Scenario: To add Customer
    Given The user should be telecom homepage and click the Add Customer
    When The user should provide valid details
    |ruby | sherly | rubysherly@gmail.com | chennai | 9952089680 |
    Then The user should validate the Customer ID
