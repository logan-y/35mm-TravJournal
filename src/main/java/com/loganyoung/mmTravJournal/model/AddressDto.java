package com.loganyoung.mmTravJournal.model;

import com.loganyoung.mmTravJournal.entities.Address;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AddressDto {
    private Long id;
    private String city;
    private String state;

    public AddressDto(Address address) {
        this.id = address.getId();
        this.city = address.getCity();
        this.state = address.getState();
    }
}
