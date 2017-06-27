/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polymorphism;

import encapsulation.*;

/**
 *
 * @author ilgarrasulov
 */

class Movie{
    private String name;

    public Movie(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
    
    public String plot(){
        return "No plot here";
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people";
    }
    
}
class IndependenceDay extends Movie{

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attept to take Earth"; //To change body of generated methods, choose Tools | Templates.
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Maze Runner";
    }
    
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Star Wars plot";
    }
    
}

class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable Movie");
    }

    
}

class Car{
private String name;
private int cylinders,wheels;
private boolean engine;

public Car(String name,int cylinders){
    this.name=name;
    this.cylinders=cylinders;
    this.engine=true;
    this.wheels=4;
}

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public void startEngine(){
        System.out.println("Car.startengine() is called");
    }
    public void accelerate(){
            System.out.println("Car.accelerate() is called");
    }
    public void brake(){
            System.out.println("Car.brake() is called");
    }
    
}
class Lamborgini extends Car{

    public Lamborgini() {
        super("Lamborgini", 4);
    }

    @Override
    public void startEngine(){
        System.out.println(getClass().getSimpleName()+".startengine() is called");
    }
    @Override
    public void accelerate(){
            System.out.println(getClass().getSimpleName()+".accelerate() is called");
    }
    @Override
    public void brake(){
            System.out.println(getClass().getSimpleName()+".brake() is called");
    }
}

class Porcshe extends Car{

    public Porcshe() {
        super("Porcshe", 4);
    }

    @Override
    public void startEngine(){
        System.out.println("Porcshe.startengine() is called");
    }
    @Override
    public void accelerate(){
            System.out.println("Porcshe.accelerate() is called");
    }
    @Override
    public void brake(){
            System.out.println("Porcshe.brake() is called");
    }
}

class Mercedes extends Car{

    public Mercedes() {
        super("Mercedes", 4);
    }

    @Override
    public void startEngine(){
        System.out.println("Mercedes.startengine() is called");
    }
    @Override
    public void accelerate(){
            System.out.println("Mercedes.accelerate() is called");
    }
    @Override
    public void brake(){
            System.out.println("Mercedes.brake() is called");
    }
}

public class Main {
    public static void main(String[] args) {
//
//        for(int i=0;i<11;i++)
//        {
//            Movie movie=randomMoview();
//            System.out.println("Movie #"+i+" : "+movie.getName()+"\n"
//            +"Plot: "+movie.plot()+"\n");
//            
//        }

    Car car=new Car("baseCar", 8);
    car.startEngine();
    car.accelerate();
    car.brake();
    
        Lamborgini lambo=new Lamborgini();
    lambo.startEngine();
    lambo.accelerate();
    lambo.brake();
    
    
    
    }

    public static Movie randomMoview(){
    int randomNumber=(int)(Math.random()*5)+1;
        System.out.println("Random number generated was: "+randomNumber);
        switch(randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
    
}
