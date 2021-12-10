package com.karina.hotelsapplication.remote.rest.dto.request;

import java.util.List;

public class AddReservationDto {
    private List<HotelReservationDto> reservations;
    private PersonReservationDto person;

    public AddReservationDto() {
    }

    public AddReservationDto(List<HotelReservationDto> reservations, PersonReservationDto person) {
        this.reservations = reservations;
        this.person = person;
    }

    public List<HotelReservationDto> getReservations() {
        return reservations;
    }

    public void setReservations(List<HotelReservationDto> reservations) {
        this.reservations = reservations;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }
}
