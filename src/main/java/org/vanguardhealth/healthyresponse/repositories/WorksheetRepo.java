package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.Worksheet;

public interface WorksheetRepo extends CrudRepository<Worksheet, Long> {
}
