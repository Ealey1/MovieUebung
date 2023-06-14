package com.hsb.movie.movies;

import java.util.Objects;

public class Movie {

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

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        final Movie other = (Movie) obj;

        if ((!Objects.equals(this.id, other.id)) || (!Objects.equals(this.name, other.name)))
            return false;

        return true;
    }
}
