/* Name: Mansi Sanghvi
 * Project: Programming Assignment 4
 * Date: 06/17/2024
 * Purpose: Online Shopping Cart (Part 2) */

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart
{
private String customerName;
private String currentDate;
private ArrayList<ItemToPurchase> cartItems;
Scanner scnr = new Scanner(System.in);

//Default Constructor
public ShoppingCart()
{
customerName = "none";
currentDate = "January 1, 2016";
cartItems = new ArrayList<ItemToPurchase>();
}

//Pramaterized Constructor/Overloader
public ShoppingCart(String customerName, String currentDate)
{
this.customerName = customerName;
this.currentDate = currentDate;
cartItems = new ArrayList<ItemToPurchase>();
}

//Public member methods
public String getCustomerName()
{
return customerName;
}

public String getDate()
{
return currentDate;
}

public void addItem(ItemToPurchase item)
{
cartItems.add(item);
}

public void removeItem(String itemName)
{
int found = 0;
for (int i = 0; i < cartItems.size(); i++)
{
if((cartItems.get(i).getName().equals(itemName)))
{
cartItems.remove(i);
return;
}
}
System.out.println("Item not found in cart. Nothing removed.");
}

public void modifyItem(String ItemToPurchase)
{
int found = 0;
for (int i = 0; i < cartItems.size(); i++)
{
if((cartItems.get(i).getName().equals(ItemToPurchase)))
{
System.out.println("Enter the new quantity");
int amount = scnr.nextInt();
cartItems.get(i).setQuantity(amount);
return;
}
}
System.out.println("Item not found in cart. Nothing modified.");
}

public int getNumItemsInCart()
{
int totalQuant = 0;

for (int i = 0; i < cartItems.size(); i++)
{
totalQuant = totalQuant + cartItems.get(i).getQuantity();
}
return totalQuant;
}

public int getCostOfCart()
{
int totalCost = 0;

for (int i = 0; i < cartItems.size(); i++)
{
totalCost = totalCost + (cartItems.get(i).getQuantity() * cartItems.get(i).getPrice());
}
return totalCost;
}

public void printTotal()
{
System.out.println(this.customerName + "'s Shopping Cart - " + currentDate);
if(cartItems != null && !cartItems.isEmpty()) {
System.out.println("Number of Items: " + getNumItemsInCart());
System.out.println();

for(ItemToPurchase item: cartItems)
{
item.printItemCost();
}

System.out.println();
System.out.println("Total: " + "$" + getCostOfCart());
}else {
System.out.println("Empty Cart");
}
}

public void printDescriptions()
{
System.out.println(customerName + "'s Shopping Cart - " + currentDate);
System.out.println();
System.out.println("Item Descriptions");
for (ItemToPurchase item : cartItems)
{
item.printItemDescription();
}
}
}