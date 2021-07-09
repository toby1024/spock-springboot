package com.example.spockspringboot.infrastructure.adapter.repository.dataobject;

import lombok.Data;

@Data
public class CityDO {
    private Long id;
    private String name;
    private String state;
    private String country;
}
