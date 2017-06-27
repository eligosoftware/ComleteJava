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
public class Vehicle {
    
    private String name,size;
    private int currentVelocity,currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
    
        currentDirection=0;
        currentVelocity=0;
    }
    
    
    
    public void steer(int direction){
        System.out.println("Vehicle.steer()");
        this.currentDirection+=direction;
    }
    public void move(int velocity, int direction){
          System.out.println("Vehicle.steer()");
          currentDirection=direction;
          currentVelocity=velocity;
    }

    public void stop(){
    this.currentVelocity=0;
    }
    
    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    
    
}
