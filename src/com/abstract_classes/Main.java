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
public class Main {
    public static void main(String[] args) {
        Dog dog =new Dog("Yorkie");
        dog.breathe();
        dog.eat();
        
        Parrot bird=new Parrot("Jovie");
        bird.breathe();
        bird.eat();
        bird.fly();
        
        Penguin penguin = new Penguin("Coco");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    }
}
