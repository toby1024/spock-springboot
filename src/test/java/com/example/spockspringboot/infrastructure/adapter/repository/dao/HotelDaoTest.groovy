package com.example.spockspringboot.infrastructure.adapter.repository.dao

import com.example.base.BaseBootTest
import com.example.spockspringboot.infrastructure.adapter.repository.dataobject.CityDO
import com.example.spockspringboot.infrastructure.adapter.repository.dataobject.HotelDO
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Shared

class HotelDaoTest extends BaseBootTest {
    @Autowired
    HotelDao hotelDao
    @Autowired
    CityDao cityDao

    @Shared
    CityDO city
    @Shared
    def cityId

    @Override
    void setup() {
        city = new CityDO(name: "test_city", state: "test_state", country: "test_country")
        cityId = cityDao.save(city)
    }

    def "should_save_success_and_query_right_data"() {
        given:
        HotelDO hotelDO = new HotelDO(cityId: cityId, name: "test_hotel", address: "test_address", zip: "test_zip")

        when:
        def id = hotelDao.save(hotelDO)
        HotelDO byCity = hotelDao.selectByCityId(cityId)
        HotelDO byId = hotelDao.selectById(id)

        then:
        assert byCity.getName().equals(hotelDO.getName())
        assert byId.getName().equals(hotelDO.getName())

        assert byCity.getAddress().equals(hotelDO.getAddress())
        assert byId.getAddress().equals(hotelDO.getAddress())

        assert byCity.getZip().equals(hotelDO.getZip())
        assert byId.getZip().equals(hotelDO.getZip())
    }
}
