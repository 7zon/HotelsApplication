package com.karina.hotelsapplication.remote.rest.dto.request;

import java.util.List;

public class AddHotelDto {
    private String name;
    private List<AddRoomDto> sizes;

    public AddHotelDto() {
    }

    public AddHotelDto(String name, List<AddRoomDto> sizes) {
        this.name = name;
        this.sizes = sizes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AddRoomDto> getSizes() {
        return sizes;
    }

    public void setSizes(List<AddRoomDto> sizes) {
        this.sizes = sizes;
    }
}
