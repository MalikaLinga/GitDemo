Feature: Search and place order for vegetables

@SeleniumTest
Scenario: Search for items and vaidate the results
Given User is on GreenKart landing page
When User searches for Cucumber vegetable
Then "Cucumber" results are displayed

@SeleniumTest
Scenario: Add more items and proceed to checkout page
Given User is on GreenKart landing page
When User searches for Brinjal vegetable
And User add the items to cart
And User proceed to checkout page
Then veify selected Brinjal is displayed in the checkout page

@SeleniumTest
Scenario Outline: Add more items and proceed to checkout page
Given User is on GreenKart landing page
When User searches for <Name> vegetable
And User add the items to cart
And User proceed to checkout page
Then veify selected <Name> is displayed in the checkout page

 Examples:
|Name	|
|Cauliflower|
|Beetroot|
|Tomato|
