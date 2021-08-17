package org.vanguardhealth.healthyresponse.controllers;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
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
    public Collection<Worksheet> getWorksheets() {
        return (Collection<Worksheet>) worksheetRepo.findAll();
    }

    @GetMapping("/worksheets/{id}")
    public Worksheet getWorksheet(@PathVariable Long id) {
        return worksheetRepo.findById(id).get();
    }

}
