package com.labs.dto.global;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Confirmed {

    private String provinceState;
    private String countryRegion;
    private String confirmed;
    private String active;
    private String combinedKey;

}
