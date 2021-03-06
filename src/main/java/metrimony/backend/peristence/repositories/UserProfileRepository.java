package metrimony.backend.peristence.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import metrimony.backend.peristence.domain.backend.specific.UserProfile;

@Repository
public interface UserProfileRepository extends CrudRepository<UserProfile, Integer> {

}
