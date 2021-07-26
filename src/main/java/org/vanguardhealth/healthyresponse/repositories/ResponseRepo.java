package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.Response;

public interface ResponseRepo extends CrudRepository<Response,Long> {
}
