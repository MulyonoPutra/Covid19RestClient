package com.labs.controller;

import com.labs.service.GlobalConfirmedService;
import com.labs.service.GlobalDeathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/death")
public class GlobalDeathController {

    @Autowired
    GlobalDeathService deathService;


    /**
     * GET All Death Data Endpoint Method
     *
     * @return findAll() from {@link GlobalDeathService}
     */
    @GetMapping
    public ResponseEntity<?> findAllDeath() {
        return deathService.findAll();
    }
}
