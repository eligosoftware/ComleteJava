/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop_master_challenge;

/**
 *
 * @author ilgarrasulov
 */
public class Hamburger {
    private String rollType;
    private String meat;
    private int price;

    public int getPrice() {
 
        int priceToReturn=this.price;
        if(addition1!=null){
            priceToReturn+=addition1.getPrice();
        }
        if(addition2!=null){
            priceToReturn+=addition2.getPrice();
        }
        if(addition3!=null){
            priceToReturn+=addition3.getPrice();
        }
        if(addition4!=null){
            priceToReturn+=addition4.getPrice();
        }
        
        return priceToReturn;
    }

    public void setAddition1(Addition addition1) {
        this.addition1 = addition1;
    }

    public void setAddition2(Addition addition2) {
        this.addition2 = addition2;
    }

    public void setAddition3(Addition addition3) {
        this.addition3 = addition3;
    }

    public void setAddition4(Addition addition4) {
        this.addition4 = addition4;
    }
    
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;

    public Hamburger(String rollType, String meat,int price) {
        this.rollType = rollType;
        this.meat = meat;
        this.price=price;
    }
    
    
    
    
    
}
