package com.labs.controller;

import com.labs.service.GlobalConfirmedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/confirmed")
public class GlobalConfirmedController {

    @Autowired
    GlobalConfirmedService confirmedService;


    /**
     * GET All Confirmed Data Endpoint Method
     *
     * @return findAll() from {@link GlobalConfirmedService}
     */
    @GetMapping
    public ResponseEntity<?> findAllConfirmed() {
        return confirmedService.findAll();
    }
}
