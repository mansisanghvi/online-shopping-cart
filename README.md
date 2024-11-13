Program: Online shopping cart

(1) Create file ItemToPurchase.java 

Build the ItemToPurchase class with the following specifications:
- Private fields
  - String itemName - Initialized in default constructor to "none"
  - int itemPrice - Initialized in default constructor to 0
  - int itemQuantity - Initialized in default constructor to 0
- Default constructor
- Public member methods (mutators & accessors)
  - setName() & getName() 
  - setPrice() & getPrice()
  - setQuantity() & getQuantity() 
 
Extend the ItemToPurchase class per the following specifications:
- Private fields
  - string itemDescription - Initialized in default constructor to "none"
- Parameterized constructor to assign item name, item description, item price, and item quantity. 
- Public member methods
  - setDescription() mutator & getDescription() accessor 
  - printItemCost() - Outputs the item name followed by the quantity, price, and subtotal
  - printItemDescription() - Outputs the item name and description


(2) Create two new files:

- ShoppingCart.java - Class definition
- ShoppingCartManager.java - Contains main() method

Build the ShoppingCart class with the following specifications.
-  Private fields
  - String customerName - Initialized in default constructor to "none"
  - String currentDate - Initialized in default constructor to "January 1, 2016"
  - ArrayList cartItems
- Default constructor
- Parameterized constructor which takes the customer name and date as parameters 
- Public member methods
  - getCustomerName() accessor 
  - getDate() accessor 
  - addItem()
      - Adds an item to cartItems array. Has a parameter of type ItemToPurchase. Does not return anything.
  - removeItem()
      - Removes item from cartItems array. Has a string (an item's name) parameter. Does not return anything.
      - If item name cannot be found, output a message: Item not found in cart. Nothing removed.
- modifyItem()
  - Modifies an item's description, price, and/or quantity. Has a parameter of type ItemToPurchase. Does not return anything.
  - If item can be found (by name) in cart, check if parameter has default values for description, price, and quantity. If not, modify item in cart.
  - If item cannot be found (by name) in cart, output a message: Item not found in cart. Nothing modified.
- getNumItemsInCart() 
  - Returns quantity of all items in cart. Has no parameters.
- getCostOfCart() 
  - Determines and returns the total cost of items in cart. Has no parameters.
- printTotal()
  - Outputs total of objects in cart.
  - If cart is empty, output a message: SHOPPING CART IS EMPTY
- printDescriptions()
 - Outputs each item's description.
 - If cart is empty, output a message: SHOPPING CART IS EMPTY
