/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package chapter10;;

/**
 *
 * @author Icey Thugg
 */
public class Employees {

    public String name1 = "FRED Smith";
    public String name2 = "Fred Smith";
    
    public void areNamesEqual () {
        if (name1.equals(name2)) {
            System.out.println("Same name.");
        } else {
            System.out.println("Different name.");
        } 
    } 
    
     public void areNamesEqual2 () {
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Same name.");
        } else {
            System.out.println("Different name.");
        } 
     }
    public static void main (String[] args) {
        Employees employees = new Employees();
        
        employees.areNamesEqual2();
    }    
        
    }        
        
  
    
    

