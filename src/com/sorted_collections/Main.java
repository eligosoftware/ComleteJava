package com.sorted_collections;

/**
 * Created by mragl on 19.07.2017.
 */
public class Main {
    private static StockList stockList=new StockList();
    public static void main(String[] args) {
        StockItem temp=new StockItem("bread",0.86,100);
        stockList.addStock(temp);

        temp=new StockItem("cake",1.10,7);
        stockList.addStock(temp);

        temp=new StockItem("car",12.50,2);
        stockList.addStock(temp);

        temp=new StockItem("chair",62,10);
        stockList.addStock(temp);

        temp=new StockItem("cup",0.50,200);
        stockList.addStock(temp);

        temp=new StockItem("cup",0.45,7);
        stockList.addStock(temp);

        temp=new StockItem("door",72.95,4);
        stockList.addStock(temp);

        temp=new StockItem("juice",2.50,36);
        stockList.addStock(temp);
        temp=new StockItem("phone",96.99,35);
        stockList.addStock(temp);
        temp=new StockItem("towel",2.40,80);
        stockList.addStock(temp);
        temp=new StockItem("vase",8.76,40);
        stockList.addStock(temp);

        System.out.println(stockList);
        for(String s:stockList.items().keySet()){
            System.out.println(s);
        }

        Basket timsBasket=new Basket("Tim");

    }
    private static int sellItem(Basket basket,String item,int quantity){
        StockItem inStock=stockList.get(item);
        if(inStock==null){
            System.out.println("We don't sell "+item);
            return 0;
        }
        if(stockList.reserveStock(item,quantity)!=0){
            return basket.addToBasket(inStock,quantity);
        }
        return 0;
    }
    private static int removeItem(Basket basket,String item,int quantity){
        StockItem inStock=stockList.get(item);
        if(inStock==null){
            System.out.println("We don't sell "+item);
            return 0;
        }
        if(basket.removeFromBasket(inStock,quantity)==quantity){
            return stockList.unreserveStock(item,quantity);
        }
        return 0;
    }
}
