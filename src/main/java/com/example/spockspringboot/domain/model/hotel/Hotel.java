package com.example.spockspringboot.domain.model.hotel;


import com.example.spockspringboot.application.hotel.cmd.CreateHotelCmd;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor
public class Hotel implements Serializable {
    private Long id;
    private String name;
    private String address;
    private String zip;
    private CityVO cityVO;

    public static Hotel generate(CreateHotelCmd cmd){
        Hotel hotel = new Hotel();
        hotel.name = cmd.getHotelName();
        hotel.address = cmd.getAddress();
        hotel.zip = cmd.getZip();
        CityVO cityVO = new CityVO(cmd.getCityId());
        hotel.cityVO = cityVO;
        return hotel;
    }

    public Hotel setCityVO(CityVO city){
        this.cityVO = city;
        return this;
    }
}
