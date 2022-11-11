package ml.streaming.bkostream.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import ml.streaming.bkostream.model.User;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, Long> {
    
}
