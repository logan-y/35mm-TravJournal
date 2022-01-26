package com.loganyoung.mmTravJournal.model;

import com.loganyoung.mmTravJournal.entities.FilmType;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class FilmTypeDto {
    private Long id;
    private String name;

    private String brand;
    private Long speed;

    public FilmTypeDto(FilmType filmType) {
        this.id = filmType.getId();
        this.name = filmType.getName();
    }
}
