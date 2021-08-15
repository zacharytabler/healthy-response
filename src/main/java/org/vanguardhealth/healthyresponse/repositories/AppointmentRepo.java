package org.vanguardhealth.healthyresponse.repositories;

import java.util.Map;

public interface AppointmentRepo {
    Object findAll();

    Map<Object, Object> findById(Long id);
}
