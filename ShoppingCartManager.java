/* Name: Mansi Sanghvi
 * Project: Programming Assignment 4
 * Date: 06/17/2024
 * Purpose: Online Shopping Cart (Part 2) */

import java.util.Scanner;
public class ShoppingCartManager
{
static Scanner scnr = new Scanner(System.in);
public static void main(String[] args)
{
String customerName;
String currentDate;

System.out.println("Enter Customer's Name:");
customerName = scnr.nextLine();

System.out.println("Enter Today's Date:");
currentDate = scnr.nextLine();
ShoppingCart cartItems = new ShoppingCart(customerName, currentDate);

System.out.println("");
System.out.println("Customer Name: " + customerName);
System.out.println("Today's Date: " + currentDate);

printMenu(cartItems);
}

public static void printMenu(ShoppingCart cartItems)
{
char selection;
String userInput;
System.out.println("\nMENU");
System.out.println("a - Add item to cart");
System.out.println("d - Remove item from cart");
System.out.println("c - Change item quantity");
System.out.println("i - Output items' descriptions");
System.out.println("o - Output shopping cart");
System.out.println("q - Quit\n");
System.out.println("Choose an option:");

selection = scnr.nextLine().trim().charAt(0);
while (selection != 'q' && selection != 'a' && selection != 'd' && selection != 'c' && selection != 'i' && selection != 'o')
{
System.out.println("Choose an option:");
selection = scnr.nextLine().trim().charAt(0);
}

switch (selection)
{
case 'q':
System.exit(0);
break;

// i - Output items' Description
case 'i':
System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
cartItems.printDescriptions();
printMenu(cartItems);
break;

// o - Output shopping cart
case 'o':
System.out.println("OUTPUT SHOPPING CART");
cartItems.printTotal();
printMenu(cartItems);
break;

//a - Add item to cart
case 'a':
String Name;
String Description;
int Price;
int Quantity;
System.out.println("");
System.out.println("ADD ITEM TO CART");
System.out.println("Enter the item name:");
Name = scnr.nextLine().trim().toString();

System.out.println("Enter the item description:");
Description = scnr.nextLine().trim().toString();

System.out.println("Enter the item price:");
Price = scnr.nextInt();
scnr.nextLine();

System.out.println("Enter the item quantity:");
Quantity = scnr.nextInt();
scnr.nextLine();

ItemToPurchase itemToPurchase = new ItemToPurchase(Name, Description, Price, Quantity);
cartItems.addItem(itemToPurchase);

printMenu(cartItems);
break;

// d- remove item from cart
case 'd':
String remove;
System.out.println("");
System.out.println("REMOVE ITEM FROM CART");
System.out.println("Enter name of item to remove:");
remove = scnr.nextLine();
cartItems.removeItem(remove);

printMenu(cartItems);
break;

// c - Change item quantity
case 'c':
int quant;
String Name2;
System.out.println("CHANGE ITEM QUANTITY");
System.out.println("Enter the item name:");
Name2 = scnr.nextLine();
System.out.println("Enter the new quantity:");
quant = scnr.nextInt();
scnr.nextLine();
cartItems.modifyItem(Name2);

printMenu(cartItems);
break;

}
}
}