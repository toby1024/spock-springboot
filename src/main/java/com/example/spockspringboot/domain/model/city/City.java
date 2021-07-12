package com.example.spockspringboot.domain.model.city;

import lombok.Getter;

@Getter
public class City {
    private Long cityId;
    private String name;
    private String state;
    private String country;

    private String hotelName;
    private String address;
    private String zipCode;
}
