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
![snap from code](/e-commerce/Screenshot from 2024-11-03 22-08-50.png)
![code run](/e-commerce/Screenshot from 2024-11-03 23-31-40.png)
