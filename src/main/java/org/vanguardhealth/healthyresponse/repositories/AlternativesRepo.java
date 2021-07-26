package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.Alternatives;

import javax.persistence.Entity;

public interface AlternativesRepo extends CrudRepository<Alternatives,Long> {
}
