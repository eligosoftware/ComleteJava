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
public class Fish extends Animal{

    private int gills, eyes, fins;

    public Fish(int gills, int eyes, int fins, String name, int size, int weight) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    
    
    public void rest(){
    }
    private void moveMuscles(){
    }
    private void moveBackFin(){
    }
    public void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
    
}
