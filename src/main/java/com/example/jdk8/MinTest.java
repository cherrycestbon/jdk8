package com.example.jdk8;

import com.example.jdk8.pojo.Track;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinTest {
    public static void main(String[] args) {
        Track track1 = new Track("Bakai", 524);
        Track track2 = new Track("Violets for Your Furs", 378);
        Track track3 = new Track("Time Was", 451);
        List<Track> list = new ArrayList<>();
        list.add(track1);
        list.add(track2);
        list.add(track3);
        list.stream().min(Comparator.comparing(track -> track.getLength())).get();

        Collections.sort(list);
        list.forEach(i -> System.out.println(i.getLength()));

    }
}
