package org.vanguardhealth.healthyresponse.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.vanguardhealth.healthyresponse.models.Worksheet;
import org.vanguardhealth.healthyresponse.repositories.UserRepo;
import org.vanguardhealth.healthyresponse.repositories.WorksheetRepo;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin
public class WorksheetController {

    @Resource
    private WorksheetRepo worksheetRepo;

    @Resource
    private UserRepo userRepo;

    @GetMapping("/worksheets")
    public Collection<Worksheet> getWorksheets(@PathVariable Long id) {
        return (Collection<Worksheet>) worksheetRepo.findAll();
    }

    @GetMapping("/worksheets/{id}")
    public Collection<Worksheet> getWorksheets(@PathVariable Long id) {
        return worksheetRepo.findById().get();
    }
}
