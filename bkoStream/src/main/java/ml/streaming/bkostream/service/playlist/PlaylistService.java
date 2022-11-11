package ml.streaming.bkostream.service.playlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ml.streaming.bkostream.model.Playlist;
import ml.streaming.bkostream.model.User;
import ml.streaming.bkostream.repository.playlist.PlaylistRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class PlaylistService implements PlaylistServiceInterface{

    @Autowired
    private PlaylistRepository playlistRepository;

    public Flux<Playlist> findAll() {
        return playlistRepository.findAll();
    }

    public Mono<Playlist> findById(Long id) {
        return playlistRepository.findById(id);
    }

    
    public void createPlaylist(Playlist playlist) {
        playlistRepository.save(playlist).subscribe();
    }

    public Mono<Void> remove(Long id) {
        return playlistRepository.deleteById(id);
    }

    
    @Override
    public Flux<Playlist> findTop6ByOrderByViewsDesc() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Flux<Playlist> findTop6ByOrderByLikesDesc() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Flux<Playlist> findTop6ByOrderByCreateDateDesc() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Flux<Playlist> findAllByUser(User user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Flux<Playlist> findAllByNameContaining(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<Playlist> deleteByUserId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }
}
