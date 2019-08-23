/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

/**
 *
 * @author Icey Thugg
 */
public class dog {
    
    public String name;
    public int age;
    
    public void bark () {
        System.out.println("bark");
    }
    
    public static void main(String[] args) {
        dog dog = new dog();
        dog.name = "fido";
        dog.age = 20;
        
        dog.bark();
        
}
}