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
public class Bank {
    private String name;
    private ArrayList<Branch> branches=new ArrayList<Branch>();
    
    public String getName() {
        return name;
    }

    public Bank(String name) {
        this.name = name;
    }
    
    public Branch addBranch(String branchName,Double initialTransactionAmount){
        Branch addedBranch=new Branch(branchName,initialTransactionAmount);
        branches.add(addedBranch);
        return addedBranch;
    }
}
