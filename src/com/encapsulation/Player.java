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
public class Player {
    public String fullName,weapon;
    public int health;
    
    public void loseHealth(int damage){
        this.health-=damage;
        if(this.health<=0){
            System.out.println("Player knocked out");
        }
    }
    public int healthRemaining(){
        return health;
    }
}
