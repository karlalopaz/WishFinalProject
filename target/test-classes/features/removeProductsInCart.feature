Feature: Cart

  Scenario: Remove products in the cart
    Given I navigate to Wish
    And I have products added in the cart
    When I open the cart
    Then I remove all the products