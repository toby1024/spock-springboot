package com.example.spockspringboot.application.hotel

import com.example.base.BaseBootTest
import com.example.spockspringboot.application.hotel.cmd.CreateHotelCmd
import com.example.spockspringboot.application.hotel.dto.HotelDTO
import org.springframework.beans.factory.annotation.Autowired

class CreateHotelAppServiceTest extends BaseBootTest {
    @Autowired
    CreateHotelAppService createHotelAppService

    def "创建hotel"() {
        given:
        CreateHotelCmd cmd = new CreateHotelCmd(cityId: baseCityId,
                                                hotelName: "test_create_hotel_name",
                                                address: "test_address",
                                                zip: "test_zip")
        when:
        HotelDTO hotelDTO = createHotelAppService.createHotel(cmd)

        then:
        assert hotelDTO.getCityName() == baseCityId
        assert hotelDTO.getName() == cmd.getHotelName()
    }
}
