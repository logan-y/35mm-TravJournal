package com.loganyoung.mmTravJournal.entities;

import lombok.Data;

import javax.persistence.*;

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

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name="post_filmTypes",
            joinColumns = {@JoinColumn(name="filmTypeId", referencedColumnName = "id")},
    inverseJoinColumns = {
            @JoinColumn(name = "post_id", referencedColumnName = "id")})
    private Post post;



}
