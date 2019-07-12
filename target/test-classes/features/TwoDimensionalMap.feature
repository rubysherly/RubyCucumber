@tag
Feature: To add Customer

  @tag1
  Scenario: To add Customer
    Given The user should be telecom homepage and click the Add Customer
    When The user should provide valid details
      | fname   | lname    | email                | address | phone      |
      | ruby    | sherly   | rubysherly@gmail.com | chennai | 9952089680 |
      | lydia   | shamily  | lydia@gmail.com      | chennai | 9791252580 |
      | johanna | princess | johanna@gmail.com    | chennai |  841015379 |
      | prince  | samuel   | prince@gmail.com     | chennai | 9841018567 |
    Then The user should validate the Customer ID
