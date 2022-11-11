package ml.streaming.bkostream.service.playlist_song;


import org.springframework.stereotype.Service;

import ml.streaming.bkostream.model.Playlist;
import ml.streaming.bkostream.model.Playlist_Song;
import ml.streaming.bkostream.model.Song;
import ml.streaming.bkostream.repository.playlist_song.PlaylistSongRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class Playlist_songService implements Playlist_songServiceInterface {
    

    private PlaylistSongRepository playlistSongRepository;

    

    public void savePlaylistSong(Playlist_Song playlist_Song) {
        playlistSongRepository.save(playlist_Song).subscribe();
    }

    public Mono<Void> delete(Long id) {
        return playlistSongRepository.deleteById(id);
    }


    public Mono<Playlist_Song> findById(Long id) {
        return playlistSongRepository.findById(id);
    }

    @Override
    public Flux<Playlist_Song> findAllByPlaylist(Playlist playList) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<Playlist_Song> deleteBySong(Song song) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Flux<Playlist_Song> findByPlaylistAndSong(Playlist playList, Song song) {
        // TODO Auto-generated method stub
        return null;
    }

    
    
}
