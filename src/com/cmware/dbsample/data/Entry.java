package com.cmware.dbsample.data;

/**
 * A basic entry object containing data for the app.
 */
public class Entry {

    private Long id;
    private String name;
    private String location;

    public Entry(String name, String location) {
        super();
        this.name = name;
        this.location = location;
    }

    public Entry(Long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return getName() + ":" + getId();
    }

}
