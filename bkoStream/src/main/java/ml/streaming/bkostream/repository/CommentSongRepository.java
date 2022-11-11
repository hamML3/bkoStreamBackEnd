package ml.streaming.bkostream.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import ml.streaming.bkostream.model.Comment_Song;




@Repository
public interface CommentSongRepository extends ReactiveMongoRepository<Comment_Song, Long> {

   
}
