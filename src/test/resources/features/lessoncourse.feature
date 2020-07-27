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

@turker
    Scenario: Findig Math under of Academics
      Given User navigates to homepage
      When User mouse over category button
      Then User mouse over academics
      Then User click on math button

