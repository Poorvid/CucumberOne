@BDDSTORY-ZS2-2
Feature: Cart functionality



	@BDDTEST-ZS2-4
	@BDDVER-10004
	@BDDCYC-79f2c96b-14cd-4075-aeef-56c135b5763a
	Scenario: authticated and authorized user can add items to the cart
	
		Given    the user is logged into Swaglabs
		When     the user clicks on the add to cart button for an item
		Then     the item should get added to the cart

