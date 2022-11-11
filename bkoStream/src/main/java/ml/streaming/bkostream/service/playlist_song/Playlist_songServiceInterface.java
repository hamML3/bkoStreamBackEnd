package ml.streaming.bkostream.service.playlist_song;


import ml.streaming.bkostream.model.Playlist;
import ml.streaming.bkostream.model.Playlist_Song;
import ml.streaming.bkostream.model.Song;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface Playlist_songServiceInterface {
    
    Flux<Playlist_Song> findAllByPlaylist(Playlist playList);

    Mono<Playlist_Song> deleteBySong(Song song);

    Flux<Playlist_Song> findByPlaylistAndSong(Playlist playList,Song song);
}
