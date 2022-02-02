package com.loganyoung.mmTravJournal.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
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

    private String title;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creationDate;

    @Column(columnDefinition="TEXT")
    private String notes;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name="post_filmTypes",
            joinColumns = {@JoinColumn(name="filmTypeId", referencedColumnName = "id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "post_id", referencedColumnName = "id")})
    @EqualsAndHashCode.Exclude
    private Set<FilmType> filmTypes;

    @ManyToOne
    private Address address;

    public void addFilmType (FilmType filmType){
        this.filmTypes.add(filmType);
    }


}
