Feature:
#
  Background: "chrome" testing
#
#  @smoke
  Scenario: Verify button is visible/clickable
    Given User navigates to homepage
    When User should be able to click on Coaching
    Then User should be able to verify Coaching page
    Then User should be able to go to Home page by clicking Home button
    Then User should be able to verify that is on Home page