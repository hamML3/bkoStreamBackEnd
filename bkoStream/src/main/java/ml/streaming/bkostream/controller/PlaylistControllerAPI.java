package ml.streaming.bkostream.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ml.streaming.bkostream.model.Playlist;
import ml.streaming.bkostream.service.playlist.PlaylistService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



@RestController
@RequestMapping("/playlist")
public class PlaylistControllerAPI {

    @Autowired
    private PlaylistService playlistService;

  
    @GetMapping("/lists")
    public Flux<Playlist> showAllPlaylist() {
       return playlistService.findAll();
    
    }

    
    @GetMapping("/list/{id}")
    public Mono<Playlist> findPlaylistById(@PathVariable("id")Long id){
        return playlistService.findById(id);
    }
    /*
     *  @GetMapping("/listUserID/{id}")
    public ResponseEntity<List<PlayList>> playListUserID(@PathVariable Long id) {
        User user = userService.finByID(id);
        List<PlayList> playListList = playlistService.playlistUserID(user);
        return new ResponseEntity<List<PlayList>>(playListList, HttpStatus.OK);
    }

    @PostMapping("/creates")
    public ResponseEntity<PlayList> createPlaylist(@RequestBody PlayList playList) {
        playList.setLikes((long) 0);
        playList.setViews((long) 0);
        playList.setCreateDate(new Timestamp(new Date().getTime()));
        playlistService.save(playList);
        return new ResponseEntity<>(playList, HttpStatus.OK);
    }

    @GetMapping("/edit/{id}")
    public ResponseEntity<PlayList> PlaylistByID(@PathVariable Long id) {
        PlayList playList1 = playlistService.findById(id).get();
        if (playList1 != null) {
            return new ResponseEntity<PlayList>(playList1, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/edit")
    private ResponseEntity<PlayList> editPlaylist(@RequestBody PlayList playList) {
        playlistService.save(playList);
        return new ResponseEntity<PlayList>(playList, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<PlayList> deletePlaylist(@PathVariable Long id) {
        Optional<PlayList> playList = playlistService.findById(id);
        if (playList.isPresent()) {
            playlistService.remove(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/playlistsong/{id}")
    private ResponseEntity<List<Song>> songPlaylisy(@PathVariable Long id) {
        PlayList playList = playlistService.findById(id).get();
        if (playList != null) {
            List<Playlist_Song> playlist_songs = playlist_songService.playlistSong(playList);
            List<Song> songList = new ArrayList<>();
            for (Playlist_Song playSong : playlist_songs) {
                songList.add(playSong.getSong());
            }
            return new ResponseEntity<List<Song>>(songList, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // 
    @PutMapping("/addsong/{id}")
    private ResponseEntity<Void> saveSongToPlaylist(@PathVariable("id") Long id, @RequestBody Song song) {

        PlayList playList = playlistService.findById(id).get();
        if (playList != null && song != null) {
            Playlist_Song playlistSong = new Playlist_Song();
            playlistSong.setPlaylist(playList);
            playlistSong.setSong(song);
            if(playlist_songService.findByPlaylistAndSong(playList,song)!=null){
                return new ResponseEntity<>(HttpStatus.OK);
            }
            playlist_songService.save(playlistSong);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

   

    @DeleteMapping("/deleteSonginPlaylist/{playlistid}/{songid}")
    private ResponseEntity<Void> deleteSongInPlaylist(@PathVariable("playlistid") Long playlistid, @PathVariable("songid") Long songid) {
        PlayList playList = playlistService.findById(playlistid).get();
        List<Playlist_Song> playlistSong = playlist_songService.finAllByPlaylist(playList);
        for (int i = 0; i < playlistSong.size(); i++) {
            if (playlistSong.get(i).getSong().getId() == songid) {
                playlist_songService.delete(playlistSong.get(i).getId());
            }
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // 
    @PostMapping("/savecommentPlaylist")
    private ResponseEntity<Void> saveCommentPlaylist(@RequestBody Comment_Playlist comment_playlist) {
        LocalDateTime localDateTime = LocalDateTime.now();
        if (comment_playlist != null) {
            comment_playlist.setDate(localDateTime);
            commentPlayListService.save(comment_playlist);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    // 

    @GetMapping("/showcomment/{id}")
    private ResponseEntity<List<Comment_Playlist>> showComment(@PathVariable("id") Long id) {
        PlayList playList = playlistService.findById(id).get();
        if (playList != null) {
            List<Comment_Playlist> comment_playlists = commentPlayListService.showCommentByPlaylist(playList);
            return new ResponseEntity<List<Comment_Playlist>>(comment_playlists, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // 

    @GetMapping("/findplaylist/{name}")
    private ResponseEntity<List<PlayList>> findPlaylistByName(@PathVariable("name") String name){
        List<PlayList> playLists = playlistService.findPlaylistByName(name);
        return new ResponseEntity<List<PlayList>>(playLists,HttpStatus.OK);
    }
     */

   


}
