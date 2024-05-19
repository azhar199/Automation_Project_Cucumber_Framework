Feature: End to End Feature

@Test
Scenario Outline: Verify successful End to End Automate the Ecoomerce Website
Given User Launch site URL
When Enter correct "<username>" and "<password>"
And Click on login button
And Add to cart product
And Check the cart
And Check the checkout
And Fill your First name
And Fill your LastName
And Fill your Postal Code
And Tap on continue 
And Scroll down to Finish
And Tap on Finish button 
Then Validate the the Thank you for your order !


Examples:
|username | password|
|standard_user | secret_sauce|