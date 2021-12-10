package com.karina.hotelsapplication.remote.rest.dto.response;

import java.util.List;

public class HotelDto {

    private Integer Id;
    private String Name;
    private List<RoomDto> Sizes;

    public HotelDto(Integer id, String name, List<RoomDto> sizes) {
        Id = id;
        Name = name;
        Sizes = sizes;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<RoomDto> getSizes() {
        return Sizes;
    }

    public void setSizes(List<RoomDto> sizes) {
        Sizes = sizes;
    }
}
