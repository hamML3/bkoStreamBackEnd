package ml.streaming.bkostream.repository;


import ml.streaming.bkostream.model.Singer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SingerRepository extends ReactiveMongoRepository<Singer,Long> {
    
}
