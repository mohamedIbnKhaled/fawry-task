# fawry-task
E-commerce project 
# classes 
## Product
### Fields 
id, product name, price, quantity, expiry date, needshipping, weight
### Class Features
you can create a project and set all the fields for the project.
this class implements the ShippableItem interface
## Cart
### Fields 
id, list of items, subTotal, Shipping, package weight
### Class Features
add the product to the cart 
remove the product from the cart
clear it
get amount
display items
## Customer
### Fields 
id, name, balance, my cart
### Class Features
create customer add balance 
make checkout 
## ShippingService
### Class Features
get the shipping items

## relationships between classes
. The cart has a Product (aggregation relationship)
. The customer has a Cart (composition relationship)
# screenshots
![Code Snap](Screenshot%20from%202024-11-03%2023-31-40.png)
![Code Run](Screenshot%20from%202024-11-03%2022-08-50.png)

