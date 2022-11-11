package ml.streaming.bkostream.service.singerAndSongService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ml.streaming.bkostream.model.Singer;
import ml.streaming.bkostream.model.Singer_And_Song;
import ml.streaming.bkostream.model.Song;
import ml.streaming.bkostream.repository.SingerAndSongReposiory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class SingerAndSongService implements SingerAndSongServiceInterface{
    @Autowired
    SingerAndSongReposiory singerAndSongReposiory;

    public Flux<Singer_And_Song> findAll() {
        return singerAndSongReposiory.findAll();
    }

    public Mono<Singer_And_Song> findById(Long id) {
        return singerAndSongReposiory.findById(id);
    }

    public void createSingerAndSong(Singer_And_Song singer_And_Song) {
        singerAndSongReposiory.save(singer_And_Song).subscribe();
    }

    public void delete(Long id) {
        singerAndSongReposiory.deleteById(id);
    }

    
    @Override
    public void deleteBySong(Song song) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Flux<Singer_And_Song> findAllBySinger(Singer singer) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Flux<Singer_And_Song> findAllBySong(Song song) {
        // TODO Auto-generated method stub
        return null;
    }

    
    
   }
