package com.labs.dto.global;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Recovered {

    private String provinceState;
    private String countryRegion;
    private String recovered;
    private String active;
    private String combinedKey;

}
