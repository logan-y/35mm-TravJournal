package com.loganyoung.mmTravJournal.model;

import com.loganyoung.mmTravJournal.entities.Address;
import com.loganyoung.mmTravJournal.entities.FilmType;
import com.loganyoung.mmTravJournal.entities.Post;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Set;

@NoArgsConstructor
@Data
public class PostDto {
    private Long id;
    private String title;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String body;
    private Address address;
    private Set<FilmType> filmTypes;

    public PostDto(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.date = post.getCreationDate();
        this.body = post.getBody();
        this.address = post.getAddress();
        this.filmTypes = post.getFilmTypes();

    }
}
