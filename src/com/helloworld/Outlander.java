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
public class Outlander extends Car{

    private int roadServiceMonths;
    
    public Outlander(int roadserviceMonths) {
        super(6, 5, 5, false, "Outlander", "4WD");
        this.roadServiceMonths=roadserviceMonths;
    }
    
    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity()+rate;
        if(newVelocity==0){
        stop();
            changeGear(1);
        } else if(newVelocity>0 && newVelocity<10){
            changeGear(1);
        }
        else if(newVelocity>10 && newVelocity<20){
            changeGear(2);
        }
        else if(newVelocity>20 && newVelocity<30){
            changeGear(3);
        }
        else{
            changeGear(4);
        }
        if(newVelocity>0){
            changeVelocity(newVelocity, getCurrentDirection());
         }
    }
}
