package ml.streaming.bkostream.service.song;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ml.streaming.bkostream.model.Song;
import ml.streaming.bkostream.model.User;
import ml.streaming.bkostream.repository.SongRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class SongService implements SongServiceInterface{
    @Autowired
    SongRepository songRepository;


    
    public Flux<Song> getSongs() {
        return songRepository.findAll();
    }

    
    public Mono<Song> getSong(Long id) {
        return songRepository.findById(id);
    }

    
    public Mono<Void> deleteSong(Long id) {
        return songRepository.deleteById(id);
    }
 
       
    public Flux<Song> findByCreatDate(Date date) {
         return null;
     }

      
    @Override
    public Flux<Song> findByUser(User user) {
        // TODO Auto-generated method stub
        return null;
    }
  
    @Override
    public Flux<Song> findTop6ByOrderByLikesDesc() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public Flux<Song> findTop6ByOrderByCreatDateDesc() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public Flux<Song> deleteByUserId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public Flux<Song> findAllByCreateDate(Date date) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public Flux<Song> findAllByNameContaining(String name) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public Flux<Song> findTop6ByOrderByViewsDesc() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public void createSong(Song song) {
        songRepository.save(song).subscribe();
        
    }


    @Override
    public Mono<Song> updateSong(Song song, Long id) {
        return songRepository.save(song);
    }

}
