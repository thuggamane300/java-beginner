/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo6;

/**
 *
 * @author Icey Thugg
 */
public class ShoppingCart {
    
    public static void main(String[] args) {
        
    Item item1 = new Item();
    Item item2 = new Item();
   
    item1.desc = "Shirt";
    item2.desc = "Pants";
    
    item1 = item2;
    System.out.println("Item1: " +item1.desc);
    System.out.println("Item1: " +item2.desc);
    
    
    
    
  
    
    
}
}
