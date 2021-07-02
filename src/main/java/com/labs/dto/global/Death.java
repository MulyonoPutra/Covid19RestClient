package com.labs.dto.global;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Death {

    private String provinceState;
    private String countryRegion;
    private String death;
    private String active;
    private String combinedKey;

}
