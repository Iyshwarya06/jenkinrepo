Feature: Fish order feature
Scenario: Submit the fish order and validate whether submitted or not

Given Login petStore application
When I click fish link
And I choose product ID
And I choose item ID
And I click Add to cart
And I click proceed to check
And I click continue
And I click confirm
Then I verify the order is submitted
And I close the browser 