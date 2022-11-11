package ml.streaming.bkostream.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ml.streaming.bkostream.model.User;
import ml.streaming.bkostream.repository.UserRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService implements UserServiceInterface{

    @Autowired
    UserRepository userRepository;

    public Flux<User> getUsers() {
        return userRepository.findAll();
    }

    public Mono<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    public void createUser(User user){
         userRepository.save(user);
    }

    public Mono<Void> deleteUser(Long id){
         return userRepository.deleteById(id);
    }

    
    @Override
    public Boolean existsByUsername(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean existsByEmail(String email) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Flux<Object> findAllUsersByCreateDate() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<User> findByUsername(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<User> updateUser(User e) {
        // TODO Auto-generated method stub
        return null;
    }
}
