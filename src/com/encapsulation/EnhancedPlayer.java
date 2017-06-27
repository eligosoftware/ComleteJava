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
public class EnhancedPlayer {
    private String name,weapon;
    private int hitPoints=100;

    public EnhancedPlayer(String name, String weapon, int health) {
        this.name = name;
        
        this.weapon = weapon;
        
        if(health>0 && health<=200){
            this.hitPoints = health;
        }
    }
    
    public void loseHealth(int damage){
        this.hitPoints-=damage;
        if(this.hitPoints<=0){
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return hitPoints;
    }
    
    
}
