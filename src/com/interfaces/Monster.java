/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ilgarrasulov
 */
public class Monster implements ISaveable{

    private String name;
    private double health,armor,skill;

    public double getHealth() {
        return health;
    }

    public double getArmor() {
        return armor;
    }

    public double getSkill() {
        return skill;
    }

    public String getName() {
        return name;
    }
     
    
    public Monster(String name,double health, double armor, double skill) {
        this.health = health;
        this.armor = armor;
        this.skill = skill;
        this.name=name;
    }
    
    
    @Override
    public void save(List<Double> values) {
        int i=0;
        for(Double value:values){
            switch(i){
                case 0:
                    health=value;
                    break;
                case 1:
                    skill=value;
                    break;
                case 2:    
                    armor=value;
                    break;
                default:
                    break;
            }
            i++;
        }
    }

    @Override
    public List<Double> load() {
        List<Double> result=new ArrayList<Double>();
        result.add(health);
        result.add(skill);
        result.add(armor);

        return result;
    }

    @Override
    public String toString() {
        
        return "Monster "+name+": health - "+health+", skill - "+skill+",armor - "+armor;
    }
    
}
