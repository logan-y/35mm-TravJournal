package com.loganyoung.mmTravJournal.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class FilmType {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long speed;
    private String brand;


    @ManyToMany(mappedBy = "filmTypes")
    @EqualsAndHashCode.Exclude //check out docs
    private List<Post> posts;


}
