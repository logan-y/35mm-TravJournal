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



    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name="post_filmTypes",
            joinColumns = {@JoinColumn(name="filmTypeId", referencedColumnName = "id")},
    inverseJoinColumns = {
            @JoinColumn(name = "post_id", referencedColumnName = "id")})
    @EqualsAndHashCode.Exclude //check out docs
    private List<Post> posts;


}
