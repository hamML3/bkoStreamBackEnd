package ml.streaming.bkostream.repository;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import ml.streaming.bkostream.model.Singer_And_Song;


public interface SingerAndSongReposiory extends ReactiveMongoRepository<Singer_And_Song,Long> {
    

}
