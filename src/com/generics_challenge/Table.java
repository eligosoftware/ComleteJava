/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generics_challenge;

import java.util.ArrayList;
import generics.*;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author ilgarrasulov
 */
public class Table<T extends Team> {
    
    private String name;

    public Table(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    
    
    private ArrayList<T> teams=new ArrayList<>();
    
    
    public boolean addTeam(T team){
        if(teams.contains(team)){
            System.out.println("Team "+team.getName()+" is already in table "+this.getName() );
            return false;
        }
        else{
            teams.add(team);
            System.out.println("Added team "+team.getName()+" to the table "+this.getName());
            return false;
        
        }}
    
    public void printTeams(){
        Collections.sort(this.teams);
        int num=1;
        System.out.println("Ratings:");
        for(T t:teams){
            System.out.println(num+": "+t.getName());
            num++;
        }
    }
}
