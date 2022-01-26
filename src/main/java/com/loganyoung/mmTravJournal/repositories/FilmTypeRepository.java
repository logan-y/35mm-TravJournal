package com.loganyoung.mmTravJournal.repositories;

import com.loganyoung.mmTravJournal.entities.FilmType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmTypeRepository extends JpaRepository<FilmType, Long> {
}
