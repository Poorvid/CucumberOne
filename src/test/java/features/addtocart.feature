Feature: Add to cart functionality of the Swag labs

  Scenario:  authticated and authorized user can add items to the cart
    Given    the user is logged into Swaglabs
    When     the user clicks on the add to cart button for an item
    Then     the item should get added to the cart
