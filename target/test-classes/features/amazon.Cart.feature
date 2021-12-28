Feature: amazon cart page verification

  As a user I should able to click Cart link and should able to see Cart page

  Scenario: User should be able to click cart link to see the cart page

    Given User is on amazon home page
    When User click Cart link
    Then User should go to Cart page
