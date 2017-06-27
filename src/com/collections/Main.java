/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 *
 * @author mragl
 */
public class Main {
    public static void main(String[] args) {
        Theatre theatre=new Theatre("Olympian", 8, 12);
      
//        if(theatre.reserveSeat("D12")){
//            System.out.println("Please pay for D12");
//        }
//        else{
//            System.out.println("Seat already reserved");
//        }
//        if(theatre.reserveSeat("D12")){
//            System.out.println("Please pay for D12");
//        }
//        else{
//            System.out.println("Seat already reserved");
//        }
//        if(theatre.reserveSeat("B13")){
//            System.out.println("Please pay for B13");
//        }
//        else{
//            System.out.println("Seat already reserved");
//        }
        
        
        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00",13.00));
        
        Collections.sort(priceSeats,Theatre.PRICE_ORDER);
        
        printList(priceSeats);
        
    }
    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat : list){
            System.out.print(" "+seat.getSeatNumber()+" "+seat.getPrice());
        }
        System.out.println();
        System.out.println("=======================================");
    }
    
}
