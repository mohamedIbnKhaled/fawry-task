# fawry-task
E-commerce project 
# classes 
## Product
### Fields 
id, productName, price, quantity, expiryDate,needShipping,weight
### class Features
you can create project and set all the fields for the project.
this class implements ShippableItem interface

## relationships between classes
. Cart has a Products (aggregation relationship)
. Customer has a one Cart (composition relationship)
