/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedLists;

import java.util.LinkedList;

/**
 *
 * @author ilgarrasulov
 */
public class Album {
    private LinkedList songs;
    private String title;

    public LinkedList getSongs() {
        return songs;
    }

    public String getTitle() {
        return title;
    }

    public Album(String title) {
        this.title = title;
        songs =new LinkedList<Song>();
    }
    
    public boolean addSong(Song song){
        if(songs.contains(song)){
            return false;
        }
        else{
            songs.add(song);
            return true;
        }
    }
    
}
