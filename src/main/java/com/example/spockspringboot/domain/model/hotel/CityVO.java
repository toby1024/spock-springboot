package com.example.spockspringboot.domain.model.hotel;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor
public class CityVO implements Serializable {
    private Long cityId;
    private String name;
    private String state;
    private String country;

    public CityVO(Long cityId) {
        this.cityId = cityId;
    }
}
