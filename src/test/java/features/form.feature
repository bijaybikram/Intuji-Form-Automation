Feature: Form Page
  Description: Testing Form Page

  Background:
    Given User navigates to demo-form page

  Scenario Outline: Verify successful form submission
    Given User enters valid Firstname <firstname> or Lastname <lastname> or Mobile <mobile>
    When User clicks submit button
    Examples:
      |firstname|lastname|mobile|
      |Ram|Chalise|9876543210|



    Scenario Outline: Verify unsuccessful form submission
      Given User enters invalid Firstname <firstname> or Lastname <lastname> or Mobile <mobile>
      When User clicks submit button
      Examples:
        |firstname|lastname|mobile|
        ||Chalise|9876543210|
        |Ram||9876543210|
        |Ram|Chalise||
        |Ram|Chalise|987|




