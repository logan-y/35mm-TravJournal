package com.loganyoung.mmTravJournal.model;

import com.loganyoung.mmTravJournal.entities.FilmType;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class FilmTypeDto {
    private Long id;
    private String name;

    private Long brand_id;
    private Long speed_id;

    public FilmTypeDto(FilmType filmType) {
        this.id = filmType.getId();
        this.name = filmType.getName();
        this.brand_id = filmType.getBrand_id();
        this.speed_id = filmType.getSpeed_id();
    }
}
