package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.Consequence;

public interface ConsequenceRepo extends CrudRepository<Consequence,Long> {
}
