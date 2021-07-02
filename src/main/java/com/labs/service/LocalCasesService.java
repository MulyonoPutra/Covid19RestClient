package com.labs.service;

import com.labs.dto.local.Cases;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import static com.labs.constants.GlobalConstants.LOCAL_BASE_URL;

@Service
public class LocalCasesService {

    private final RestTemplate restTemplate;

    public LocalCasesService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * Find All Cases in Indonesia
     *
     * @return Cases Object
     */
    public ResponseEntity<Cases> findAllCases(){
        return restTemplate.getForEntity(LOCAL_BASE_URL, Cases.class);
    }
}
