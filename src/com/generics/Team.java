/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generics;

import java.util.ArrayList;

/**
 *
 * @author ilgarrasulov
 */
public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    int played=0;
    int won=0;
    int lost=0;
    int tied =0;
    
    private ArrayList<T> members=new ArrayList<>();
    
    public Team(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    
    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(player.getName()+" is already on this team");
            return false;     
        }
        else{
            members.add(player);
            System.out.println(player.getName()+" picked for team "+this.getName());
            return true;
        }
    }
    
    public int numPlayers(){
        return members.size();
    }
    
    public void matchResult(Team<T> opponent,int ourscore,int theirscore){
        
        String message;
        
        if(ourscore>theirscore){
            message= " won ";
            won++;
        } else if(ourscore==theirscore){
            message= " tied with ";
            tied++;
        }
        else{
            message= " lost to ";
            lost++;
        }
        played++;
        
        if(opponent!=null){
            System.out.println(this.getName()+message+opponent.getName());
            opponent.matchResult(null, theirscore, ourscore);
        }
    }
    public int ranking(){
        return won*3+tied;
    }

    @Override
    public int compareTo(Team<T> o) {
        if(this.ranking()>o.ranking()){
            return -1;
        } else if (this.ranking()<o.ranking()){
        return 1;}
        else {
            return 0;
        }
        
    }
}
