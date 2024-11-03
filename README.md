# fawry-task
E-commerce project 
# classes 
## Product
### Fields 
id, productName, price, quantity, expiryDate,needShipping,weight
### class Features
you can create project and set all the fields for the project.
this class implements ShippableItem interface
## Cart
### Fields 
id, list of items, subTotal, Shipping, packageWeight
### class Features
add product to cart 
remove product from the cart
clear it
get amount
displayitems
## Customer
### Fields 
id, name, balance, mycart
### class Features
create customer 
add balance 
make checkout 
## ShippingService
### class Features
get the shipping items

## relationships between classes
. Cart has a Products (aggregation relationship)
. Customer has a one Cart (composition relationship)
