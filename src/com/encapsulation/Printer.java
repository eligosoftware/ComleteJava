/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encapsulation;

/**
 *
 * @author ilgarrasulov
 */
public class Printer {
    private int tonerLevel,pages;

    public int getTonerLevel() {
        return tonerLevel;
    }
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel>-1 && tonerLevel<=100){
        this.tonerLevel = tonerLevel;
        }else {
        this.tonerLevel=-1;
        }
        this.duplex = duplex;
    }
    
    public int addToner(int amount){
       
        if(amount>0 && amount<=100)
        {
            if(tonerLevel+amount>100){
                return -1;
            }
        tonerLevel+=amount;
        return tonerLevel;
    }
        else{
        return -1;
        }
    
  }
    public int printPages(int pages){
        int pagesToPrint=pages;
        if( this.duplex )
        {
            pagesToPrint/=2;
            System.out.println("Printing in duplex mode");
        }
        this.pages+=pagesToPrint;
        return pagesToPrint;
    }

    public int getPages() {
        return pages;
    }
    
    
}
