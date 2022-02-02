package com.loganyoung.mmTravJournal.repositories;

import com.loganyoung.mmTravJournal.entities.FilmType;
import com.loganyoung.mmTravJournal.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmTypeRepository extends JpaRepository<FilmType, Long> {
//    List<FilmType> findByPost(Post post);
}
