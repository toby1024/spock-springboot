package com.example.spockspringboot.application.hotel.cmd;

import lombok.Data;

import java.io.Serializable;

@Data
public class CreateHotelCmd implements Serializable {

    private String cityName;
    private String stateName;
    private String countryName;

}
