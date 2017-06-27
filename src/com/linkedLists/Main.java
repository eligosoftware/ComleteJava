/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author ilgarrasulov
 */
public class Main {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit=new LinkedList<String>();
//        addInOrder(placesToVisit, "Sydney");
//        addInOrder(placesToVisit,"Melbourne");
//        addInOrder(placesToVisit,"Brisbane");
//        addInOrder(placesToVisit,"Perth");
//        addInOrder(placesToVisit,"Perth");
//        addInOrder(placesToVisit,"Canberra");
//        addInOrder(placesToVisit,"Adelaide");
//        addInOrder(placesToVisit,"Darwin");
        
        LinkedList<Song> playlist=new LinkedList<Song>();
        
        ArrayList<Album> albums=new ArrayList<Album>();
        
        Album album1=new Album("No1");
        Album album2=new Album("No2");
        Album album3=new Album("No3");
        
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

        Song song1=new Song("Song1", "04:45");
        Song song2=new Song("Song2", "03:50");
        Song song3=new Song("Song3", "06:43");
        Song song4=new Song("Song4", "02:55");

        album1.addSong(song1);
        album1.addSong(song2);
        album2.addSong(song3);
        album3.addSong(song4);
        
        playlist.add((Song) albums.get(0).getSongs().get(0));
        playlist.add((Song) albums.get(0).getSongs().get(1));
        playlist.add((Song) albums.get(1).getSongs().get(0));
        playlist.add((Song) albums.get(2).getSongs().get(0));
        
        printplayList(playlist);
        
        play(playlist);
        
//        placesToVisit.add(1, "Alice Springs");
//        
//        visit(placesToVisit);
                
//        printList(placesToVisit);
//        placesToVisit.remove(4);
//        printList(placesToVisit);
        
    }
    
    private static void printplayList(LinkedList<Song> songs){
        Iterator<Song> i=songs.iterator();
        
        while(i.hasNext()){
            System.out.println("Now playing "+i.next());
        }
        System.out.println("================================");
    }
    
    private static void printList(LinkedList<String> places){
        Iterator<String> i=places.iterator();
        
        while(i.hasNext()){
            System.out.println("Now visiting "+i.next());
        }
        System.out.println("================================");
    }
    
    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> iterator=linkedList.listIterator();
        
        while(iterator.hasNext()){
            int comparison = iterator.next().compareTo(newCity);
            
            if(comparison==0){
                //the city is already in the list, do not add
                System.out.println(newCity+" is already added to the list");
                return false;
            }
            else if(comparison>0){
            // new city should appear before the current one   
            //Brisbane -->Adelaide
            iterator.previous();
            iterator.add(newCity);
            return true;
            } else {
                // move to next city
            }
        }
        iterator.add(newCity);
        return true;
    }
    
    private static void play(LinkedList songs){
        Scanner scanner =new Scanner(System.in);
        
        boolean quit = false;
        boolean goingForward=true;
        ListIterator<Song> iterator=songs.listIterator();
        
        if(songs.isEmpty()){
            System.out.println("No songs in the playlist");
            return;
        }
        else{
            System.out.println("Now playing "+iterator.next());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Bye bye");
                    quit=true;
                    break;
                case 1:
                    if(!goingForward){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        goingForward=true;
                    }
                    
                    if(iterator.hasNext()){
                        System.out.println("Now playing "+iterator.next());
                    }
                    else
                    {
                        System.out.println("Reached the end of the list");
                        goingForward=false;                    
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        goingForward=false;
                    }
                    if(iterator.hasPrevious()){
                        System.out.println("Now playing "+iterator.previous());
                    }
                    else {
                        System.out.println("Reached the beginning of the list");                        
                      goingForward=true;
                    }
                    break;
                case 3:
                    if(goingForward){
                       if(iterator.hasPrevious()){
                        iterator.previous();
                        }
                   System.out.println("Now playing "+iterator.next());
                    
                    }
                    else{
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                   System.out.println("Now playing "+iterator.previous());
                    }
                    break;
                case 4:
                   if(songs.size()>0){
                       iterator.remove();
                       if(iterator.hasNext()){
                           System.out.println("Now playing "+iterator.next());
                       }
                       else if(iterator.hasPrevious()){
                           System.out.println("Now playing "+iterator.previous());
                       }
                   }
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    printplayList(songs);
                    break;
            }
            
        }
    
    }
    
    private static void visit(LinkedList cities){
        Scanner scanner=new Scanner(System.in);
        boolean quit = false;
        boolean goingForward=true;
        ListIterator<String> iterator=cities.listIterator();
        
        if(cities.isEmpty()){
            System.out.println("No cities in the iterary");
            return;
        }
        else{
            System.out.println("Now visiting "+iterator.next());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Vacation is over");
                    quit=true;
                    break;
                case 1:
                    if(!goingForward){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        goingForward=true;
                    }
                    
                    if(iterator.hasNext()){
                        System.out.println("Now visiting "+iterator.next());
                    }
                    else
                    {
                        System.out.println("Reached the end of the list");
                        goingForward=false;                    
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        goingForward=false;
                    }
                    if(iterator.hasPrevious()){
                        System.out.println("Now visiting "+iterator.previous());
                    }
                    else {
                        System.out.println("Reached the beginning of the list");                        
                      goingForward=true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
            
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n"+
                    "1 - to play next song\n"+
                    "2 - to play previous song\n"+
                    "3 - to replay song\n"+
                "4 - to remove song\n"+
                "5 - to print menu options\n"+
                "6 - to print playlist"
                );
    }
}
