package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.Alternatives;
import org.vanguardhealth.healthyresponse.models.Appointment;

import java.util.Map;
import java.util.Optional;

public interface AppointmentRepo extends CrudRepository<Alternatives,Long> {

    }
