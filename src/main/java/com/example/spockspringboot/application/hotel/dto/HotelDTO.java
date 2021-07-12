package com.example.spockspringboot.application.hotel.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class HotelDTO implements Serializable {
    private Long id;
    private String name;
    private String address;
    private String zip;
    private String cityName;
    private String stateName;
    private String country;
}
