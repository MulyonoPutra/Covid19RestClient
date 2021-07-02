package com.labs.service;

import com.labs.dto.global.Death;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.labs.constants.GlobalConstants.GLOBAL_BASE_URL;

@Service
public class GlobalDeathService {

    private final RestTemplate restTemplate;

    public GlobalDeathService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    /**
     * GET All Death Data
     *
     * @return Death List
     */
    public ResponseEntity<Death[]> findAll(){
        return restTemplate.getForEntity(GLOBAL_BASE_URL + "death", Death[].class);
    }

}
