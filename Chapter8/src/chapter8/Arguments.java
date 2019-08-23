/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

/**
 *
 * @author Icey Thugg
 */
public class Arguments {
    
    public int calc(int x, int y){
        
        return x + y;
        
        
    }
    
    public static void main (String[] args) {
        Arguments example = new Arguments();
        
        System.out.println(example.calc(8, 9));
        
    }
}     
    
