package com.delaroystudios.cardview;

/**
 * Created by Lincoln on 18/05/16.
 */
public class Desserts {
    private String name;
    private int numOfTypes;
    private int thumbnail;

    public Desserts() {
    }

    public Desserts(String name, int numOfTypes, int thumbnail) {
        this.name = name;
        this.numOfTypes = numOfTypes;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfTypes() {
        return numOfTypes;
    }

    public void setNumOfTypes(int numOfTypes) {
        this.numOfTypes = numOfTypes;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
