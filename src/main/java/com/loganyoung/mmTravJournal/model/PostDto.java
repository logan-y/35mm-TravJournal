package com.loganyoung.mmTravJournal.model;

import com.loganyoung.mmTravJournal.entities.Address;
import com.loganyoung.mmTravJournal.entities.Post;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@NoArgsConstructor
@Data
public class PostDto {
    private Long id;
    private String title;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String notes;
    private Address address;

    public PostDto(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.date = post.getCreationDate();
        this.notes = post.getNotes();
        this.address = post.getAddress();
    }
}
