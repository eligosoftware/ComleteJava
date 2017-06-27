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
public class Animal {
    private int brain,body,size,weight;
    private String name;
    
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
    
    public void eat(){
        System.out.println("Animal.eat() called");
    }
    
    public void move(int speed)
    {
        System.out.println("Animal is moving at "+speed);
    }
    
    public String getName(){
    return name;
    }
    public int getSize(){
    return size;
    }
    public int getBrain(){
    return brain;
    }
    public int getBody(){
    return body;
    }
    public int getWeight(){
    return weight;
    }
}
