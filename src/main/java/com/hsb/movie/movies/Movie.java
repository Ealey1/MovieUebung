package com.hsb.movie.movies;

public class Movie extends MovieRepository{

    private String name;


    public static int counter = 0;

    public static int getNumOfInstances() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;


    public Movie() {
        this.name = name;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
