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
public class Dog extends Animal{

    private int eyes, legs,tail,teeth;
    private String coat;
    
    public Dog(String name, int size, int weight,int eyes,int legs,int tail,int teeth,String coat) {
        super(name, 1, 1, size, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }
    
    
    public void walk(){
        System.out.println("Dog.walk is called");
        move(5);
    }
    
    public void run(){
    }
    
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat(); //To change body of generated methods, choose Tools | Templates.
        
    }

    
    private void chew(){
        System.out.println("Dog.chew() called");
    }
    
}
