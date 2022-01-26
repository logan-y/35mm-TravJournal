package com.loganyoung.mmTravJournal.model;

import com.loganyoung.mmTravJournal.entities.Post;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@NoArgsConstructor
@Data
public class PostDto {
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String notes;
//    private Long filmId;
//    private Long addressId;

    public PostDto(Post post) {
        this.id = post.getId();
        this.date = post.getDate();
        this.notes = post.getNotes();
//        this.filmId = post.getFilmId();
//        this.addressId = post.getAddressId();
    }

}
