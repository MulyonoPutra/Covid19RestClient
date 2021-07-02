package com.labs.service;

import com.labs.dto.global.Confirmed;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.labs.constants.GlobalConstants.GLOBAL_BASE_URL;

@Service
public class GlobalConfirmedService {

    private final RestTemplate restTemplate;

    public GlobalConfirmedService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    /**
     * GET All Confirmed Data
     *
     * @return Confirmed List
     */
    public ResponseEntity<Confirmed[]> findAll(){
        return restTemplate.getForEntity(GLOBAL_BASE_URL + "confirmed", Confirmed[].class);
    }

}
