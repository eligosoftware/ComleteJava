/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedLists;

/**
 *
 * @author ilgarrasulov
 */
public class Song {
    private String title,Duration;

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return Duration;
    }

    public Song(String title, String Duration) {
        this.title = title;
        this.Duration = Duration;
    }

    @Override
    public String toString() {
        return title+" : "+Duration;
    }
    
    
    
}
