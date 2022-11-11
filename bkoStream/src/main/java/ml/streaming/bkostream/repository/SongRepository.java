package ml.streaming.bkostream.repository;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import ml.streaming.bkostream.model.Song;

@Repository
public interface SongRepository extends ReactiveMongoRepository<Song, Long> {
    

}
