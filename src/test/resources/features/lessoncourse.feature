Feature:

  Background: "chrome" testing

#  @smoke
  Scenario:
    Given User test with "chrome" browser
#    Then User should be able to see search button, login, sign up, become an instructor, shopping cart is shown on the  site

  Scenario Outline: testing the multiple entry
    Given User should be able to see "<buttons>" is shown on the  site
    Examples:
      | buttons              |
      | Search Button        |
      | Login                |
      | Sign Up              |
      | Become An Instructor |
      | Shopping Cart        |
  #User should be able to click on the home button at the bottom of the page and verify user is in the home page