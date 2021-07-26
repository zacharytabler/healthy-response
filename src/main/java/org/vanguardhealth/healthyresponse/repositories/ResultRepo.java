package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.Result;

public interface ResultRepo extends CrudRepository<Result,Long> {
}