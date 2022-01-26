package com.loganyoung.mmTravJournal.repositories;

import com.loganyoung.mmTravJournal.entities.FilmBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmBrandRepository extends JpaRepository<FilmBrand, Long> {
}
