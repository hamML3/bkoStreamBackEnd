package ml.streaming.bkostream.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ml.streaming.bkostream.model.Comment_Song;
import ml.streaming.bkostream.model.Song;
import ml.streaming.bkostream.service.commentsong.CommentSongService;
import ml.streaming.bkostream.service.playlist_song.Playlist_songService;
import ml.streaming.bkostream.service.singer.SingerService;
import ml.streaming.bkostream.service.singerAndSongService.SingerAndSongService;
import ml.streaming.bkostream.service.song.SongService;
import ml.streaming.bkostream.service.user.UserService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api/song")
public class SongController {

    @Autowired
    SongService songService;

    @Autowired
    SingerAndSongService singerAndSongService;

    @Autowired
    SingerService singerService;

    @Autowired
    UserService userService;

    @Autowired
    CommentSongService commentSongService;

    @Autowired
    Playlist_songService playlist_songService;

    
    @PostMapping("")
    public void saveSong (@RequestBody Song song) {
        songService.createSong(song);
    }

    @GetMapping("")
    public Mono<Song> findSongById(@PathVariable("id")Long id){
        return songService.getSong(id);
    }

    @GetMapping("")
    public Flux<Song> getAllSong(){
        return songService.getSongs();
    }

    @PutMapping("")
    public Mono<Song> updateSong(@RequestBody Song song, @PathVariable Long id){
        return songService.updateSong(song, id);
    }

    @GetMapping("")
    public Flux<Song> findSongByName(@PathVariable("name") String name){
        return null;
        //return songService.findAllByNameContaining(name);
    }

      

    // comment song

    @GetMapping("")
    public Flux<Comment_Song> showCommentBySongId(@PathVariable("song") Song song){
        return commentSongService.showCommentsBySong(song);
    }

    //Save comment for 1 song

    @PostMapping("")
    public void saveCommentSong(@RequestBody Comment_Song commentSong){
        commentSongService.saveCommentSong(commentSong);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteSong(@PathVariable Long id){
        return songService.deleteSong(id);
    }

}
