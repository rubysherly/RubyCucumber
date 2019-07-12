$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium/CucumberOneDimenList/src/test/resources/features/TwoDimensionalMap.feature");
formatter.feature({
  "name": "To add Customer",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "To add Customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "The user should be telecom homepage and click the Add Customer",
  "keyword": "Given "
});
formatter.match({
  "location": "OneDimensionalList.the_user_should_be_telecom_homepage_and_click_the_Add_Customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should provide valid details",
  "rows": [
    {
      "cells": [
        "fname",
        "lname",
        "email",
        "address",
        "phone"
      ]
    },
    {
      "cells": [
        "ruby",
        "sherly",
        "rubysherly@gmail.com",
        "chennai",
        "9952089680"
      ]
    },
    {
      "cells": [
        "lydia",
        "shamily",
        "lydia@gmail.com",
        "chennai",
        "9791252580"
      ]
    },
    {
      "cells": [
        "johanna",
        "princess",
        "johanna@gmail.com",
        "chennai",
        "841015379"
      ]
    },
    {
      "cells": [
        "prince",
        "samuel",
        "prince@gmail.com",
        "chennai",
        "9841018567"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "OneDimensionalList.the_user_should_provide_valid_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should validate the Customer ID",
  "keyword": "Then "
});
formatter.match({
  "location": "OneDimensionalList.the_user_should_validate_the_Customer_ID()"
});
formatter.result({
  "status": "passed"
});
});