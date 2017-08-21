package devopsbuddy.backend.peristence.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import devopsbuddy.backend.peristence.domain.backend.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

}
