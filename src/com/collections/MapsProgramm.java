/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.collections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mragl
 */
public class MapsProgramm {
    
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java","Java high level language");
        languages.put("Algol","Algol high level language");
        languages.put("Python","Python high level language");


       // languages.remove("Algol");

        if(languages.remove("Python","Python high level language")){
            System.out.println("Python removed");
        }
        else{
            System.out.println("Couldn't remove Python");
        }

        if(languages.replace("Algol","Algol high level language","A functional programming language with imperative features"))
        {
            System.out.println("Algol was replaced");
        }
        else{
            System.out.println("Algol was not replaced");
        }
        //        System.out.println(languages.replace("Scala","This wouldn't be added"));

        for (String key:languages.keySet()){
            System.out.println(key +" : "+languages.get(key));
        }

    }
    
}
