/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sorted_collections;

/**
 *
 * @author ilgarrasulov
 */
public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantityInStock;
    private int reserved;


    public int reserveStock(int quantity){
        if(quantity<=this.availableQuantity()){
            reserved+=quantity;
            return quantity;
        }
        return 0;
    }
    public int unreserveStock(int quantity){
        if(reserved>=quantity){
            reserved-=quantity;
            return quantity;
        }
        return 0;
    }

    public int finaliseStock(int quantity){
        if(quantity<-reserved){
            quantityInStock-=quantity;
            reserved-=quantity;
            return quantity;
        }
        return 0;
    }

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityInStock =0;
        this.reserved=0;
    }
    public StockItem(String name, double price,int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int availableQuantity() {
        return quantityInStock -reserved;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    @Override
    public int compareTo(StockItem o) {
         System.out.println("Entering StockItem.compareTo");
    
         if(this==o){
             return 0;
         }
         if(o!=null){
             return  this.name.compareTo(o.getName());
         }
         throw new NullPointerException();
    }

    @Override
    public String toString() {
        return name + " : price " + price+", Reserved: "+this.reserved;
    }
    
    public void adjustStock(int quantity){
    int newquantity=this.quantityInStock +quantity;
    if(newquantity>=0){
        this.quantityInStock =newquantity;
    }
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if(obj==this){
            return true;
        }
        if(obj==null || obj.getClass()!=this.getClass()){
            return false;
        }
        String objname=((StockItem)obj).getName();
        return this.name.equals(objname);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+31;
    }
    
    
    
}
