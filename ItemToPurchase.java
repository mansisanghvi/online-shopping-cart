/* Name: Mansi Sanghvi
 * Project: Programming Assignment 4
 * Date: 06/17/2024
 * Purpose: Online Shopping Cart (Part 2) */


public class ItemToPurchase
{
private String itemName = "";
private int itemPrice = 0;
private int itemQuantity = 0;
private int quantity = 0;
private int price = 0;
private String itemDescription = "none";

public ItemToPurchase()
{
this.itemDescription = "none";
this.itemName = "";
this.itemPrice = 0;
this.itemQuantity = 0;
}

public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity )
{
this.itemName = itemName;
this.itemPrice = itemPrice;
this.itemQuantity = itemQuantity;
this.itemDescription = itemDescription;
}


public void setName(String itemName)
{
this.itemName = itemName;
}

public String getName()
{
return itemName;
}

public void setPrice(int itemPrice)
{
this.itemPrice = itemPrice;
}

public int getPrice()
{
return itemPrice;
}

public void setQuantity(int itemQuantity)
{
this.itemQuantity = itemQuantity;
}

public int getQuantity()
{
return itemQuantity;
}

//Part 2 public member methods

public void setDescription(String itemDescription)
{
this.itemDescription = itemDescription;
}

public String getDescription()
{
return itemDescription;
}

public void printItemCost()
{
System.out.println(itemName + " " + itemQuantity + " " + "@ $" + itemPrice + " = $" + (itemQuantity * itemPrice));
}

public void printItemDescription()
{
System.out.println(itemName +": " + itemDescription);
}
}