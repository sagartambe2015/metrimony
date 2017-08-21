package devopsbuddy.backend.peristence.repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import devopsbuddy.backend.peristence.domain.backend.Plan;

/**
 * Created by tedonema on 29/03/2016.
 */
@Repository
public interface PlanRepository extends CrudRepository<Plan, Integer> {
}