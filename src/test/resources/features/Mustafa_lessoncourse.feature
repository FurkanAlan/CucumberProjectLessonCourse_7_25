Feature:
#
  Background: "chrome" testing
#
#  @smoke
  Scenario: Verify Turkish Language
    Given User navigates to homepage
    When User mouse over Languages
    Then User mouse over Turkish Language
    Then User verify Home page is Turkish Language