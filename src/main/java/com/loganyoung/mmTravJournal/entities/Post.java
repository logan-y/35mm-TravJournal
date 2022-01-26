package com.loganyoung.mmTravJournal.entities;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Entity
@Data
//@Table(name = "")
public class Post {
    @Id
    @GeneratedValue
    private Long id;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String notes;

    //@Column? One to many?
//    private Long filmTypeId;

//    private Long addressId;

}
