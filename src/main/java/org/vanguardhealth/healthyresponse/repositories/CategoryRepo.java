package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.Category;

public interface CategoryRepo extends CrudRepository<Category,Long> {
}
