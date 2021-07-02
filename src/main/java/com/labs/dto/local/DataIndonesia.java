package com.labs.dto.local;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DataIndonesia {

    private int id;
    private String jumlah_odp;
    private String jumlah_pdp;
    private String total_spesimen;
    private String total_spesimen_negatif;

}
