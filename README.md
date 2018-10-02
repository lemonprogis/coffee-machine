# Coffee Machine Problem Set

In this problem set, you will be simulating part of an automatic coffee dispensing machine.

## Project Description

The application currently has two classes. 
- `CoffeeMachine` can be used to get the menu and make a drink from the menu. The menu contains the name of the drink and the cost.
- `Inventory` keeps track of the ingredients available to the machine. You can use the inventory to list the ingredients and their quantities. 
Getting an ingredient from the inventory should reduce the ingredient quantity by the specified amount. 
Initially, the inventory contains 10 units of coffee, sugar and cream.

Get the tests in `CoffeeMachineTests` and `InventoryTests` passing by implementing the behavior in the above classes.

Once those tests pass, provide the ability to add a drink to the coffee machine menu. Remember to add a test for this functionality too. 

Follow these steps to begin:

- Clone this repository: git clone <>
- Open the project in and IDE of your choice. If you don't have an IDE installed, you can download the community version of Intellij here: 
https://www.jetbrains.com/idea/download/#section=mac
- To test your setup, run `./mvwn clean install`. You should get test assertion failures.  

