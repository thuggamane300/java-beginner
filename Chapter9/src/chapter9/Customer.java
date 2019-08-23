
package chapter9;

/**
 *
 * @author Icey Thugg
 */
public class Customer {

        String name;
        String phoneNumber;
        
        
    public Customer(String name, String phoneNumber) {
    }
    public Customer() {
    }
    
    
public static void main(String args[]){

        

        // Declare, instantiate, and initialize a Customer object
        Customer cust1 = new Customer("Bob Miller", "555-44-3212");

	// Print the customer object name
        System.out.println("Customer name: "+cust1.getName());

}

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }  
        
    }
    


    