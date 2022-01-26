package com.loganyoung.mmTravJournal.repositories;

import com.loganyoung.mmTravJournal.entities.FilmSpeed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmSpeedRepository extends JpaRepository<FilmSpeed, Long> {
}
