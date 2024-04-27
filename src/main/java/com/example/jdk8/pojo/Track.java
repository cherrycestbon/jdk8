package com.example.jdk8.pojo;

public class Track implements Comparable<Track>{
    private String name;
    private Integer length;

    public Track() {
    }

    public Track(String name, Integer length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public int compareTo(Track o) {
        return this.length.compareTo(o.getLength());
    }
}
