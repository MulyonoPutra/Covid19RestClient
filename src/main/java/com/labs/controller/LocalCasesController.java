package com.labs.controller;

import com.labs.service.LocalCasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/local")
public class LocalCasesController {

    @Autowired
    LocalCasesService localCasesService;

    /**
     * GET All Indonesia Cases Data Endpoint Method
     *
     * @return findAllCases() from {@link LocalCasesService}
     */
    @GetMapping
    public ResponseEntity<?> findAllCases() {
        return localCasesService.findAllCases();
    }
}
