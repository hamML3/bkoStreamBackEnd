package ml.streaming.bkostream.repository.playlist_song;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import ml.streaming.bkostream.model.Playlist_Song;

public interface PlaylistSongRepository extends ReactiveMongoRepository<Playlist_Song,Long> {
    
}
