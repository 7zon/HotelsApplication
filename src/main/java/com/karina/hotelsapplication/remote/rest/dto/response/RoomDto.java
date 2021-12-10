package com.karina.hotelsapplication.remote.rest.dto.response;

import java.math.BigDecimal;

public class RoomDto {

    private Integer Id;
    private RoomType size;
    private BigDecimal price;

    public RoomDto(Integer id, RoomType size, BigDecimal price) {
        Id = id;
        this.size = size;
        this.price = price;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public RoomType getSize() {
        return size;
    }

    public void setSize(RoomType size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
