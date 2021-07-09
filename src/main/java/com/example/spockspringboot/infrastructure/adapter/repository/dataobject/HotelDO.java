package com.example.spockspringboot.infrastructure.adapter.repository.dataobject;

import lombok.Data;

@Data
public class HotelDO {
    private Long id;
    private Long city;
    private String name;
    private String address;
    private String zip;
}
