package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.User;

public interface UserRepo extends CrudRepository<User,Long> {
}
