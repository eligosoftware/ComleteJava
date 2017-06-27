/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstract_classes;

/**
 *
 * @author ilgarrasulov
 */
public abstract class Bird extends Animal implements CanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
       System.out.println(getName()+" is pecking");
    }

    @Override
    public void breathe() {
       System.out.println("Breate in, breathe out, repeat");
    }

    @Override
    public void fly(){
        System.out.println(getName()+" is flapping its wings");
    }
    
    
}
