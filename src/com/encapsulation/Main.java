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
public class Main {
    public static void main(String[] args) {
//        Player player=new Player();
//        player.name="Tim";
//        player.health=20;
//        player.weapon="Sword";
//        
//        int damage=10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is "+player.healthRemaining());
//        
//        damage=11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is "+player.healthRemaining());
        
//     EnhancedPlayer player=new EnhancedPlayer("Tim","Sword",200);
//        System.out.println("Initial health is "+player.getHealth());
//     
     Printer printer=new Printer(50, false);
        System.out.println("Initial page count "+printer.getPages());
        int pagesPrinted=printer.printPages(4);
        System.out.println("pp "+pagesPrinted+", total "+printer.getPages());
        pagesPrinted=printer.printPages(2);
        System.out.println("pp "+pagesPrinted+", total "+printer.getPages());
    }
    
}
