package com.adventure_game;

import java.util.*;

/**
 * Created by mragl on 27.06.2017.
 */
public class Main {
    private static Map<Integer,Location> locations=new HashMap<Integer,Location>();

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        Map<String,Integer> tempExits=new HashMap<String,Integer>();
        locations.put(0,new Location(0,"You are sitting in front of a computer learning Java",tempExits));

        tempExits=new HashMap<String,Integer>();
        tempExits.put("W",2);
        tempExits.put("E",3);
        tempExits.put("S",4);
        tempExits.put("N",5);
        locations.put(1,new Location(1,"You are at the end of a road before a small brick building",tempExits));

        tempExits=new HashMap<String,Integer>();
        tempExits.put("N",5);
        locations.put(2,new Location(2,"You are at the top of a hill",tempExits));

        tempExits=new HashMap<String,Integer>();
        tempExits.put("W",1);
        locations.put(3,new Location(3,"You are inside a building, a well house for a small spring",tempExits));

        tempExits=new HashMap<String,Integer>();
        tempExits.put("N",1);
        tempExits.put("W",2);
        locations.put(4,new Location(4,"You are in a valley beside stream",tempExits));

        tempExits=new HashMap<String,Integer>();
        tempExits.put("S",1);
        tempExits.put("W",2);
        locations.put(5,new Location(5,"You are in the forest",tempExits));

        int loc=1;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            tempExits.remove("S");

            if(loc==0){
                break;
            }

            Map<String,Integer> exits=locations.get(loc).getExits();

            System.out.println("Available exits are ");

            for(String exit:exits.keySet()){
                System.out.print(exit+", ");
            }
            System.out.println();

            Map<String,String> vocabulary=new HashMap<>();
            vocabulary.put("NORTH","N");
            vocabulary.put("SOUTH","S");
            vocabulary.put("WEST","W");
            vocabulary.put("EAST","E");
            vocabulary.put("QUIT","Q");


            String direction=scanner.nextLine().toUpperCase();
            if(direction.length()>1){
                String[] directionText=direction.split(" ");
                for(String d:directionText)
                {
                    if(vocabulary.containsKey(d.toUpperCase())){
                        direction=vocabulary.get(d);
                        break;
                    }
                }
            }


            if(exits.containsKey(direction)){
                loc=exits.get(direction);
            }else {
                System.out.println("You cannot go in that direction");
            }

        }

    }
}
