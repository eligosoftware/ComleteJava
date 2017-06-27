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
public class Customer {
    private String name;
    private ArrayList<Double> transactions=new ArrayList<Double>();

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    
    public String getName() {
        return name;
    }

    public void addTransaction(Double transaction){
        transactions.add(transaction);
    }
    
    public Customer(String name,Double transactionAmount) {
        this.name = name;
        transactions.add(transactionAmount);
    }
   
    
}
