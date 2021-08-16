package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.Reviews;

import java.util.Optional;

public interface ReviewsRepo extends CrudRepository<Reviews, Long> {
    Iterable<Reviews> findAll();

    Optional<Reviews> findById(Long id);
}
