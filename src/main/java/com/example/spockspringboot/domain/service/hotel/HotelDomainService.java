package com.example.spockspringboot.domain.service.hotel;

import com.example.spockspringboot.domain.model.hotel.CityVO;
import com.example.spockspringboot.domain.model.hotel.Hotel;
import com.example.spockspringboot.domain.service.hotel.assembler.HotelDoAssembler;
import com.example.spockspringboot.infrastructure.adapter.repository.dao.CityDao;
import com.example.spockspringboot.infrastructure.adapter.repository.dao.HotelDao;
import com.example.spockspringboot.infrastructure.adapter.repository.dataobject.CityDO;
import com.example.spockspringboot.infrastructure.adapter.repository.dataobject.HotelDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.spockspringboot.application.hotel.cmd.CreateHotelCmd;

@Component
public class HotelDomainService {

    @Autowired
    private HotelDao hotelDao;
    @Autowired
    private CityDao cityDao;
    @Autowired
    private HotelDoAssembler hotelDoAssembler;

    public Hotel create(CreateHotelCmd cmd) {
        Hotel hotel = Hotel.generate(cmd);
        Long hotelId = hotelDao.save(hotelDoAssembler.convert(hotel));
        HotelDO hotelDO = hotelDao.selectById(hotelId);
        Hotel hotelResult = hotelDoAssembler.convertHotel(hotelDO);
        CityDO cityDO = cityDao.selectCityById(cmd.getCityId());
        hotelResult.setCityVO(hotelDoAssembler.convertCity(cityDO));
        return hotelResult;
    }

}
