package com.labs.dto.local;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Penambahan {

    public String jumlah_positif;
    public String jumlah_meninggal;
    public String jumlah_sembuh;
    public String jumlah_dirawat;
    public String tanggal;
    public String created;

}
