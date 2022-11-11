package ml.streaming.bkostream.service.song;

import java.util.Date;

import ml.streaming.bkostream.model.Song;
import ml.streaming.bkostream.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SongServiceInterface {

    void createSong(Song s);
    
    Flux<Song> findByUser(User user);

    Flux<Song> findTop6ByOrderByViewsDesc();

    Flux<Song> findTop6ByOrderByLikesDesc();

    Flux<Song> findTop6ByOrderByCreatDateDesc();

    Flux<Song> deleteByUserId(Long id);

    Flux<Song> findAllByCreateDate(Date date);

    Flux<Song> findAllByNameContaining(String name);

    Mono<Void> deleteSong(Long id);

    Mono<Song> updateSong(Song s);

}
