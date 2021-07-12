package com.example.spockspringboot.application.hotel.cmd;

import lombok.Data;

import java.io.Serializable;

@Data
public class CreateHotelCmd implements Serializable {

    private Long cityId;
    private String hotelName;
    private String address;
    private String zip;
}
