/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop_master_challenge;

import encapsulation.*;
import java.util.LinkedList;

/**
 *
 * @author ilgarrasulov
 */
public class Main {
    public static void main(String[] args) {
//           BigMac bigmac=new BigMac();
//           
//           bigmac.setAddition1(new Lettuce());
//           bigmac.setAddition2(new Tomato());
//           
//          System.out.println("Price = "+ bigmac.getPrice());
        
        char arr[] = {3,1,4,1,5,9,2,6,5,3,5,8,9};
        LinkedList<Integer> fifo = new LinkedList<Integer>();

        for (int i = 0; i < arr.length; i++)
            fifo.add (new Integer (arr[i]));

        System.out.print (fifo.removeFirst() + ".");
        while (! fifo.isEmpty())
            System.out.print (fifo.removeFirst());
        System.out.println();
    }
    
}
