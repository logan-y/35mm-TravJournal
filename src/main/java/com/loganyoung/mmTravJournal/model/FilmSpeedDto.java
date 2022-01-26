package com.loganyoung.mmTravJournal.model;

import com.loganyoung.mmTravJournal.entities.FilmSpeed;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class FilmSpeedDto {
    private Long id;
    private Integer speed;

    public FilmSpeedDto(FilmSpeed filmSpeed) {
        this.id = filmSpeed.getId();
        this.speed = filmSpeed.getSpeed();
    }
}
