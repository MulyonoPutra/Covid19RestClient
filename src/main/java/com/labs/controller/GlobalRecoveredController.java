package com.labs.controller;

import com.labs.service.GlobalConfirmedService;
import com.labs.service.GlobalDeathService;
import com.labs.service.GlobalRecoveredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/recovered")
public class GlobalRecoveredController {

    @Autowired
    GlobalRecoveredService recoveredService;

    /**
     * GET All Recovered Data Endpoint Method
     *
     * @return findAll() from {@link GlobalRecoveredService}
     */
    @GetMapping
    public ResponseEntity<?> findAllRecovered() {
        return recoveredService.findAll();
    }

}
