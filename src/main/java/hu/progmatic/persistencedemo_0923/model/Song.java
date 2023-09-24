package hu.progmatic.persistencedemo_0923.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Song {
    private String artist;
    private String title;
    @Id
    private Long id;

    public Song(String artist, String title, Long id) {
        this.artist = artist;
        this.title = title;
        this.id = id;
    }

    public Song() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
