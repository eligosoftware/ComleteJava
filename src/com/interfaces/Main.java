/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mragl
 */
public class Main {
    public static void main(String[] args) {
        ISaveable unit=new Player("Ilqar", 23, 44, 25);
        List<Double> state=unit.load();
        System.out.println(unit.toString());
        state.set(1, 50.0);
        state.set(0, 60.0);        
        unit.save(state);
        System.out.println(unit.toString());
        
        unit=new Monster("George", 302, 324, 435);
        System.out.println(unit.toString());
        state=unit.load();
        state.set(1, 500.0);
        state.set(0, 600.0);        
        unit.save(state);
        System.out.println(unit.toString());
        
    }
}
