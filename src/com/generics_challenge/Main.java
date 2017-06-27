/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generics_challenge;

import generics.BaseballPlayer;
import generics.FootballPlayer;
import generics.SoccerPlayer;
import generics.Team;

/**
 *
 * @author ilgarrasulov
 */
public class Main {
       public static void main(String[] args) {
                FootballPlayer joe=new FootballPlayer("Joe");
        BaseballPlayer pat=new BaseballPlayer("Pat");
        SoccerPlayer beckham=new SoccerPlayer("Beckham");
        
        Team<FootballPlayer> adelaideCrows=new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);
        Team<BaseballPlayer> baseballTeam=new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);
        
        Team<FootballPlayer> melbourne=new Team("Melbourne");
        FootballPlayer banks=new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);
        
        Team<FootballPlayer> hawthorn=new Team("Hawthorn");
        Team<FootballPlayer> freemantle=new Team("Freemantle");
        
        hawthorn.matchResult(freemantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);
        
        adelaideCrows.matchResult(freemantle, 2, 1);
        
        Table<Team<FootballPlayer>> table=new Table<>("English PL");
        table.addTeam(hawthorn);
        table.addTeam(freemantle);
        table.addTeam(melbourne);
        table.addTeam(adelaideCrows);
        
        table.printTeams();
        
           System.out.println("--------------------------------------");
                 System.out.println("Rankings");
        System.out.println(adelaideCrows.getName()+": "+adelaideCrows.ranking());
        System.out.println(melbourne.getName()+": "+melbourne.ranking());
        System.out.println(freemantle.getName()+": "+freemantle.ranking());
        System.out.println(hawthorn.getName()+": "+hawthorn.ranking());

    }
}
