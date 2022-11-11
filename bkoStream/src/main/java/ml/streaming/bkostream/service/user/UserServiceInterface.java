package ml.streaming.bkostream.service.user;

import ml.streaming.bkostream.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserServiceInterface {
    
    void createUser(User e);

    Mono<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    Mono<User> updateUser(User e);

    Mono<Void> deleteUser(Long id);

    Flux<Object> findAllUsersByCreateDate();

}
