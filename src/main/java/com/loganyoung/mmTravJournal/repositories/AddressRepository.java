package com.loganyoung.mmTravJournal.repositories;

import com.loganyoung.mmTravJournal.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}

