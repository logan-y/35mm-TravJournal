package com.loganyoung.mmTravJournal.entities;

import lombok.Data;

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



    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name="post_filmTypes",
            joinColumns = {@JoinColumn(name="filmTypeId", referencedColumnName = "id")},
    inverseJoinColumns = {
            @JoinColumn(name = "post_id", referencedColumnName = "id")})
    private List<Post> posts;


//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "Post_FilmTypes", joinColumns = { @JoinColumn(name = "FilmType_Id")},
//            inverseJoinColumns = { @JoinColumn(name = "Post_Id")})



}
