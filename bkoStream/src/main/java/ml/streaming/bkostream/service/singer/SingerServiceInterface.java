package ml.streaming.bkostream.service.singer;

import ml.streaming.bkostream.model.Singer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SingerServiceInterface {
    
    Flux<Singer> findAllByNameContaining(String name);
    Flux<Singer> findAllByNameEquals(String name);
    Mono<Singer> findById(Long id);
}
