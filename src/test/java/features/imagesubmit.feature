Feature: Form Page
  Description: Testing Form Page

  Background:
    Given User navigates to demo-form page

  Scenario Outline: Verify form submission with non image file
    Given User enters valid Firstname <firstname> or Lastname <lastname> or Mobile <mobile>
    When User add a non image file
    Then User clicks submit button
    Then User is shown with submitted form preview
    Examples:
      |firstname|lastname|mobile|
      |Ram|Chalise|9876543210|