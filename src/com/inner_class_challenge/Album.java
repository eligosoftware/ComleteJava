package inner_class_challenge;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by dev on 18/09/15.
 */
public class Album {
    private String name;
    private String artist;
    public SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList=new SongList();
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber -1;
        if((index >0) && (index <= this.songList.getSongs().size())) {
            playList.add(this.songList.getSongs().get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = songList.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    void addSong(String title, double d) {
        this.songList.addSong(title, d);
    }

    
    class SongList {
        private ArrayList<Song> songs;

        public ArrayList<Song> getSongs() {
            return songs;
        }

        public SongList() {
            this.songs = new ArrayList<Song>();
        }
   
        
        public boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }
        
        private Song findSong(String title) {
        for(Song checkedSong: this.songs) {
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }
    }
}
