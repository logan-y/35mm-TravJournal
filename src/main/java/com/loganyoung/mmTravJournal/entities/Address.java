package com.loganyoung.mmTravJournal.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    private String city;
    private String state;
    @OneToMany(mappedBy = "address")
    private List<Post> posts;

    //
}
