/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sorted_collections;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author ilgarrasulov
 */
public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list=new LinkedHashMap<>();
    }
    
    public int addStock(StockItem item){
        if(item!=null){
            //check if we already have quantities of this item
            StockItem inStock=list.getOrDefault(item.getName(),item); //return "item" if cann't find it in the
                // list by its name
            //if there are already stocks on this item, adjust the quantity
            if(inStock!=item){
                item.adjustStock(inStock.availableQuantity());
            }
            list.put(item.getName(), item);
            return item.availableQuantity();
        }
        return 0;
    }
    public int sellStock(String item,int quantity){
       StockItem inStock=list.get(item);
       if(inStock!=null && quantity>0){
           return inStock.finaliseStock(quantity);
       }
       return 0;


//    StockItem inStock=list.getOrDefault(item,null);
//
//    if(inStock!=null && inStock.availableQuantity()>=quantity && quantity>0){
//        inStock.adjustStock(-quantity);
//        return quantity;
//    }
//    return 0;
    }

    public int reserveStock(String item,int quantity){
        StockItem inStock=list.get(item);
        if(inStock!=null && quantity>0){
            return inStock.reserveStock(quantity);
        }
        return 0;
    }

    public int unreserveStock(String item,int quantity)
    {
        StockItem inStock=list.get(item);
        if(inStock!=null && quantity>0){

            return inStock.unreserveStock(quantity);
        }
        return 0;
    }
    public StockItem get(String key){
        return this.get(key);
    }
    public Map<String,StockItem> items(){
        return java.util.Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost=0.0;
        
        for(Map.Entry<String,StockItem> item : list.entrySet()){
            StockItem stockItem=item.getValue();
            double itemValue=stockItem.getPrice()*stockItem.availableQuantity();
                    
            s=s+stockItem+". There are "+stockItem.availableQuantity()+" in stock. Value of items: ";
            s=s+String.format("%.2f",itemValue)+"\n";
            totalCost+=itemValue;
                
        }
        return s+"Total stock value: "+String.format("%.2f",totalCost);
    }
    
    
}
