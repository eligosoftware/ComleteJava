/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package auto_boxing;

import java.util.ArrayList;

/**
 *
 * @author ilgarrasulov
 */
public class Branch {
    private String name;
    private Double initialTransactionAmount;
    private ArrayList<Customer> customers=new ArrayList<Customer>();
    
    public String getName() {
        return name;
    }
    
    public void showCustomers(boolean with_transactions){
        System.out.println("You have "+customers.size()+" customers in branch "+name);
        int index=1;
        for(Customer customer:customers){
            System.out.println(index+" : "+customer.getName());
            if(with_transactions){
                int index2=1;
                
                for(Double tr:customer.getTransactions()){
                    System.out.println("\t"+index2+" : "+tr);
                    index2++;
                }
            }
            index++;
        }
    }
    
    
    

    public Branch(String name, Double initialTransactionAmount) {
        this.name = name;
        this.initialTransactionAmount=initialTransactionAmount;
    }
    public Branch(String name,Double initialTransactionAmount,String[] customers_array) {
        this.name = name;
        this.initialTransactionAmount =initialTransactionAmount;
        
        for(int i=0;i<customers_array.length;i++){
        this.customers.add(new Customer(customers_array[i],initialTransactionAmount));
        }
    }
    public Customer addCustomer(String customerName){
        Customer customer=new Customer(customerName,initialTransactionAmount);
        customers.add(customer);
        return customer;
    }
}
