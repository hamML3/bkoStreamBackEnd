package ml.streaming.bkostream.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import ml.streaming.bkostream.model.Role;

@Repository
public interface RoleRepository extends ReactiveMongoRepository<Role, Long> {
}
