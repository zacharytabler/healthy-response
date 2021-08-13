package org.vanguardhealth.healthyresponse.repositories;

import org.vanguardhealth.healthyresponse.models.User;

public interface ContactUsRepo {
    Iterable<User> findAll();
}
