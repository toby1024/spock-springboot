package com.example.spockspringboot.application.hotel;

import com.example.spockspringboot.application.hotel.assembler.HotelDtoAssembler;
import com.example.spockspringboot.application.hotel.cmd.CreateHotelCmd;
import com.example.spockspringboot.application.hotel.dto.HotelDTO;
import com.example.spockspringboot.domain.model.hotel.Hotel;
import com.example.spockspringboot.domain.service.hotel.HotelDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateHotelAppService {
    @Autowired
    private HotelDomainService hotelDomainService;
    @Autowired
    private HotelDtoAssembler hotelDtoAssembler;

    public HotelDTO createHotel(CreateHotelCmd cmd){
        Hotel hotel = hotelDomainService.create(cmd);
        return hotelDtoAssembler.convert(hotel);
    }
}
