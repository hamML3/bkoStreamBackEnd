package ml.streaming.bkostream.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import ml.streaming.bkostream.model.Comment_Singer;

@Repository
public interface CommentSingerRepository extends ReactiveMongoRepository<Comment_Singer, Long> {

}
