/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworld;

/**
 *
 * @author ilgarrasulov
 */
public class HelloWorld{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dimensions dimensions=new Dimensions(20, 20, 5);
       Case theCase=new Case("2223", "Dell","248", dimensions);
       
       Monitor monitor=new Monitor("27InchBeast", "Acer", 27, new Resolution(2540, 1440));
       
       Motherboard motherboard=new Motherboard("BJ-200", "Asus","v2.44", 4, 6);
       
       PC pc=new PC(theCase, monitor, motherboard);
       
      pc.powerUp();
    }
    
}
