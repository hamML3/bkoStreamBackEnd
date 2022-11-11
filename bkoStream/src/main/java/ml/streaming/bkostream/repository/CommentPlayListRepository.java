package ml.streaming.bkostream.repository;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import ml.streaming.bkostream.model.Comment_Playlist;


@Repository
public interface CommentPlayListRepository extends ReactiveMongoRepository<Comment_Playlist, Long> {


}
