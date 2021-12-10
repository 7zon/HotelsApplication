package com.karina.hotelsapplication.remote.rest.dto.request;

import com.karina.hotelsapplication.remote.rest.dto.response.RoomDto;

import java.math.BigDecimal;

public class AddRoomDto {
    private RoomDto size;
    private BigDecimal price;

    public AddRoomDto() {
    }

    public AddRoomDto(RoomDto size, BigDecimal price) {
        this.size = size;
        this.price = price;
    }

    public RoomDto getSize() {
        return size;
    }

    public void setSize(RoomDto size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
