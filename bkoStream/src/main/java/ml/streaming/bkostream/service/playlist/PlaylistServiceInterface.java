package ml.streaming.bkostream.service.playlist;

import ml.streaming.bkostream.model.Playlist;
import ml.streaming.bkostream.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PlaylistServiceInterface {
    
            Flux<Playlist> findTop6ByOrderByViewsDesc();
            Flux<Playlist> findTop6ByOrderByLikesDesc();

            Flux<Playlist> findTop6ByOrderByCreateDateDesc();

            Mono<Playlist> deleteByUserId(Long id);

            Flux<Playlist> findAllByUser(User user);

            Flux<Playlist> findAllByNameContaining(String name);
}
