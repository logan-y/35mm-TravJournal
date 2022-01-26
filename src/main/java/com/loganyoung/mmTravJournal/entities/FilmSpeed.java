package com.loganyoung.mmTravJournal.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class FilmSpeed {

    @Id
    @GeneratedValue
    private Long id;
    private Integer speed;
}
