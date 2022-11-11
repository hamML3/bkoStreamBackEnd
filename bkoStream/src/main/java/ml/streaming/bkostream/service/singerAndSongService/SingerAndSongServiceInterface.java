package ml.streaming.bkostream.service.singerAndSongService;

import ml.streaming.bkostream.model.Singer;
import ml.streaming.bkostream.model.Singer_And_Song;
import ml.streaming.bkostream.model.Song;
import reactor.core.publisher.Flux;

public interface SingerAndSongServiceInterface {
    
    Flux<Singer_And_Song> findAllBySong(Song song);

    void deleteBySong(Song song);
    
    Flux<Singer_And_Song> findAllBySinger(Singer singer);
    
    void createSingerAndSong(Singer_And_Song s);
}
