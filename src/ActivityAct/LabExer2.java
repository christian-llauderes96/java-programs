/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivityAct;

import java.util.Scanner;

public class LabExer2 {
        String itemName;
        int itemQuantity;
        double itemPrice, amountDue;
    public static void main(String[] args) {
  
        LabExer2 lab = new LabExer2();
        lab.readInput();
        lab.writeOutput(); 
    }
    public void setItemName(String newItemName){
        this.itemName = newItemName;
    }
    public void setTotalCost(int quantity, double price){
        this.itemPrice = price;
        this.itemQuantity = quantity;
        this.amountDue = price * quantity;
    }
    public String getName(){   
        return itemName;
    }
    public double getTotalCost(){
        return amountDue;
    }
    public void readInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of the item you are purchasing.");
        String ItemName = s.nextLine();
        setItemName(ItemName);
        
        System.out.println("Enter the quantity and price separated by space.");
        int ItemQuantity = s.nextInt();
        double ItemPrice = s.nextDouble();
        setTotalCost(ItemQuantity, ItemPrice);    
    }
    public void writeOutput(){
        
        System.out.println("You are purchasing "+ itemQuantity +" "+ getName() +"(s) at "+ itemPrice +" each");
        System.out.printf("Amount Due is %.2f", getTotalCost());
        System.out.println("");
    }
    
}
