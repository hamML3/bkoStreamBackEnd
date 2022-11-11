package ml.streaming.bkostream.repository.playlist;



import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import ml.streaming.bkostream.model.Playlist;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, Long> {
            
}
