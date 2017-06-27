package com.adventure_game;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mragl on 27.06.2017.
 */
public class Location {

    private final int locationID;
    private final String description;
    private final Map<String,Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;

        exits=new HashMap<>();
        exits.put("Q",0);
    }

    public void addExit(String direction,int location){
        exits.put(direction,location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}