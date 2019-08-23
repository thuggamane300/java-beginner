/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shoppingcart;

/**
 *
 * @author Icey Thugg
 */
public class Shoppingcart {
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message = custName+" wants to purchase a " +itemDesc;
        
        
        double price = 29.99;
        int quantity = 2;
        double tax = 1.04;
        double total; 
        
        message = custName+" wants to purchase "+quantity+ " "+ itemDesc;
        
        System.out.println(message);
        
        total = quantity * price * tax;
        
        System.out.println("Total cost with tax: "+total);
        
        
        
        
    }
        
    
}
