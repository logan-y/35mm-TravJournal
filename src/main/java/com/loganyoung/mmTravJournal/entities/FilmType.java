package com.loganyoung.mmTravJournal.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class FilmType {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long speed;


    @ManyToMany(mappedBy = "filmTypes")
    @EqualsAndHashCode.Exclude
    private List<Post> posts;

    @Override
    public String toString() {
        return this.name;
    }
}
