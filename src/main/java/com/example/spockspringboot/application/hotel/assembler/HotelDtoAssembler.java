package com.example.spockspringboot.application.hotel.assembler;

import com.example.spockspringboot.application.hotel.dto.HotelDTO;
import com.example.spockspringboot.domain.model.hotel.Hotel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface HotelDtoAssembler {

    @Mappings({
            @Mapping(source = "hotel.cityVO.name", target = "cityName"),
            @Mapping(source = "hotel.cityVO.state", target = "stateName"),
            @Mapping(source = "hotel.cityVO.country", target = "country")
    })
    HotelDTO convert(Hotel hotel);
}
