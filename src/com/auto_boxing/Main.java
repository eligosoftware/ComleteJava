/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package auto_boxing;

/**
 *
 * @author ilgarrasulov
 */
public class Main {
    public static void main(String[] args) {
        Bank newBank=new Bank("Amrahbank");
        
        Branch branchA=newBank.addBranch("Branch A", 34.56);
        
        Customer Ilqar = branchA.addCustomer("Ilqar Rasulov");
        Customer Fira = branchA.addCustomer("Fira Rasulova");
        Customer Zira = branchA.addCustomer("Zira Rasulova");

        Ilqar.addTransaction(54.32);
        Ilqar.addTransaction(23.22);
        Ilqar.addTransaction(11.32);

        Fira.addTransaction(322.21);
        Fira.addTransaction(93.12);
        Fira.addTransaction(20.34);
        
        Zira.addTransaction(193.33);
        Zira.addTransaction(23.22);
        Zira.addTransaction(54.33);
        
        
        branchA.showCustomers(false);
        
        
    }
}
