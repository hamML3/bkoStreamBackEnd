package ml.streaming.bkostream.controller.admin.crud;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ml.streaming.bkostream.model.User;
import ml.streaming.bkostream.service.user.UserService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;




@RestController
@RequestMapping("/admin/user")
public class UserAdminController {

    @Autowired
    private UserService userService;

   
    @GetMapping("/users")
    //@PreAuthorize("hasRole('ROLE_ADMIN')")
    public Flux<User> getAllUsers(){
        return userService.getUsers();
    }

    @GetMapping("/users/{id}")
    //@PreAuthorize("hasRole('ROLE_ADMIN')")
    public Mono<User> findSongById(@PathVariable("id")Long id){
        return  userService.getUser(id);
    }
    

    @DeleteMapping("/users/{id}")
    //@PreAuthorize("hasRole('ROLE_ADMIN')")
    public Mono<Void> deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
               
    }

    @PostMapping(value="create/user")
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }
    
    @PutMapping("/update/user")
    @ResponseStatus(HttpStatus.OK)
    public Mono<User> updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
}
