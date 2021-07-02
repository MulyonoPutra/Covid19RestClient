package com.labs.service;

import com.labs.dto.global.Recovered;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.labs.constants.GlobalConstants.GLOBAL_BASE_URL;

@Service
public class GlobalRecoveredService {

    private final RestTemplate restTemplate;

    public GlobalRecoveredService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * GET All Recovered Data
     *
     * @return Recovered List
     */
    public ResponseEntity<Recovered[]> findAll(){
        return restTemplate.getForEntity(GLOBAL_BASE_URL + "recovered", Recovered[].class);
    }
}
