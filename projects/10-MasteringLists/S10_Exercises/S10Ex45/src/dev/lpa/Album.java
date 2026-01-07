package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double songDuration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, songDuration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equals(title)) {
                return songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;

        if (index < 0 || index >= songs.size()) {
            return false;
        }
        playlist.add(songs.get(index));
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {

        Song foundSong = findSong(title);
        if (foundSong == null) {
            return false;
        }
        playlist.add(foundSong);
        return true;
    }

    public void printAlbum() {
        for (Song song : songs) {
            System.out.println(song);
        }
    }


}
