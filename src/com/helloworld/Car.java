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
public class Car extends Vehicle{
    private int gears;
    private int wheels,doors;
    private boolean isManual;
    
    private int currentGear;
        
    public void changeGear(int gear){
        this.currentGear=gear;
        System.out.println("Car.changeGear(). Gear now is "+currentGear);
    }

    public void changeVelocity(int speed,int direction){
        move(speed, direction);
        System.out.println("Car.changeVelocity()");
           } 
            
    public Car(int gears, int wheels, int doors, boolean isManual, String name, String size) {
        super(name, size);
        this.gears = gears;
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    @Override
    public void steer(int direction) {
        super.steer(direction); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Car.steer()");
    }

        
}
