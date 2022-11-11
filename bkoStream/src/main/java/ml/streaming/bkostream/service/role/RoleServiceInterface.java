package ml.streaming.bkostream.service.role;

import ml.streaming.bkostream.model.EnumRole;
import ml.streaming.bkostream.model.Role;
import reactor.core.publisher.Mono;

public interface RoleServiceInterface {
    
    Mono<Role> findByName(EnumRole nameRome);

}
