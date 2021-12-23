GroceryStore:
	-cents2dollarsAndCents(int tax) : This method accepts an int that is then changed to a String. I passed in the costs in cents and get a String that represents those cents in dollar and cents.
Item:
	- Includes two contructors in which one intitializes name with a string and the other that has no parameters and initializes name with an empty string.
	- getCost() returns 0 in this class and has been overriden in the derived classes.
Egg:
	-Has three constructors. One has no parameters, the other egg quantity and price per dozen and the last includes egg quantity, price per dozen, and a name. The name is passed into the superclass Item.
	-Getters and setters to initialize variables and get data.
	-getCost() calculates the cost based on the egg quantity and the price per dozen.
Rice:
	-Has two constructors one with no parameters and the other with a name, weight, and price per pound. The name is passed into the superclass Item.
	-Getters and setters to initialize variables and get data.
	-getCost() calculates the cost by multiplying price per pound by the weight.
Baguette:
	- Has two constructors. One with no parameters and the second with name and cost. The name is passed into the superclass Item.
	-getCost() returns the cost of the baguette.
FlavoredBaguette:
	-Has two constructors one with no parameter and the other that has name, cost, flavor, and flavor cost. The name and cost are passed into the superclass Baguette which then passes name into its super class Item.
	-getCost() overrides Baguette's by calculating cost with flavor cost.
Checkout:
	-Contains multiple enterItem() methods one for each type of Item subclass.
	-totalCost() calculates the cost without tax and returns a string representing that amount in dollar and cents
	-totalTac() calculates the tax amount based on the totalCost and rounds it to an int. It then returns a string of the tax amount in dollar and cents.
	-totalAmt adds the tax and total cost and returns that amount as a string in dollar and cents.
	- clear() clears the array list containing the users items.
	- toString() creates a string using StringBuilder with all of the user's items and prices. This method returns a formatted receipt.
TestCheckout:
	- Contains main(String [] args) that tests the program and provides data to test out all the methods.
