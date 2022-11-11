package ml.streaming.bkostream.service.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ml.streaming.bkostream.model.EnumRole;
import ml.streaming.bkostream.model.Role;
import ml.streaming.bkostream.repository.RoleRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class RoleService implements RoleServiceInterface {

    @Autowired
    private RoleRepository roleRepository;

    public Flux<Role> findAll(){
         return roleRepository.findAll();
    }

    public Mono<Role> findById(Long id){
        return roleRepository.findById(id);
    }

    public void saveRole(Role role) {
        roleRepository.save(role).subscribe();
    }

    public Mono<Void> deleteRole(Long id){
        return roleRepository.deleteById(id);
    }

    @Override
    public Mono<Role> findByName(EnumRole nameRome) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
