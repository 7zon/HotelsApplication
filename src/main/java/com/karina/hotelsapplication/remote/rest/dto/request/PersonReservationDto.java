package com.karina.hotelsapplication.remote.rest.dto.request;

public class PersonReservationDto {
    private String name;
    private String phone;
    private Integer floor;
    private Integer room;

    public PersonReservationDto(String name, String phone, Integer floor) {
        this.name=name;
        this.phone=phone;
        this.floor=floor;
        this.room=room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }
}
