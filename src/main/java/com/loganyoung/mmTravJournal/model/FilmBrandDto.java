package com.loganyoung.mmTravJournal.model;

import com.loganyoung.mmTravJournal.entities.FilmBrand;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class FilmBrandDto {
    private Long id;
    private String brand;

    public FilmBrandDto(FilmBrand filmBrand) {
        this.id = filmBrand.getId();
        this.brand = filmBrand.getBrand();
    }

}
