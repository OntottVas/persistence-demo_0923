package hu.progmatic.persistencedemo_0923.controller;


import hu.progmatic.persistencedemo_0923.model.Song;
import hu.progmatic.persistencedemo_0923.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class SongController {
    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping
    public List<Song> showAllSongs() {
        return songService.getAllSongs();
    }

    @GetMapping("/{id}")
    public Song showSongById(@PathVariable Long id) {
        return songService.getSongById(id);
    }
}
