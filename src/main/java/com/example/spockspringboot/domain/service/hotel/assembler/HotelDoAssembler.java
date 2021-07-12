package com.example.spockspringboot.domain.service.hotel.assembler;

import com.example.spockspringboot.domain.model.hotel.CityVO;
import com.example.spockspringboot.domain.model.hotel.Hotel;
import com.example.spockspringboot.infrastructure.adapter.repository.dataobject.CityDO;
import com.example.spockspringboot.infrastructure.adapter.repository.dataobject.HotelDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface HotelDoAssembler {

    @Mappings({
            @Mapping(source = "hotel.cityVO.cityId", target = "cityId")
    })
    HotelDO convert(Hotel hotel);

    Hotel convertHotel(HotelDO hotelDO);

    CityVO convertCity(CityDO cityDO);
}
