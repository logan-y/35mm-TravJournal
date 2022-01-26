package com.loganyoung.mmTravJournal.repositories;

import com.loganyoung.mmTravJournal.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    /*
     public List<Post> findAllByFilmId(Long filmId);
      method to filter posts by film type?
    */
}
