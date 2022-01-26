package com.loganyoung.mmTravJournal.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class FilmType {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    //foreign keys
    private Long brand_id;
    private Long speed_id;


}
