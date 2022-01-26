package com.loganyoung.mmTravJournal.entities;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@Entity
@Data
public class Post {
    @Id
    @GeneratedValue
    private Long id;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creationDate;
    private String notes;

    @ManyToMany(mappedBy = "posts")
    private Set<FilmType> filmTypes;

    @ManyToOne
    private Address address;

}
