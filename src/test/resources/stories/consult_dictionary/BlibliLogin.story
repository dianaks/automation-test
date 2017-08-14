Lookup a definition
Narrative:
In order to look at my account
As a customer
I want to login into blibli.com site

Scenario: login to blibli
Given the user is on the blibli home page
When the user is login to blibli
Then the user can see

Scenario: add product to card
Given the user is in home page
When the user is search for 'buku'
Then the user can see product 'Japan Living'
And the user go to detail product
And the user add product to their cart
And the user can see product in the cart 'JapanLiving'

Scenario: checkout and payment
Given the user is in cart and see 'Japan Living'
When the user checkout
Then the user choose the payment method
And the user see thankyou page


