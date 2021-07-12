package com.example.spockspringboot.infrastructure.adapter.repository.dao

import com.example.base.BaseBootTest
import com.example.spockspringboot.infrastructure.adapter.repository.dataobject.CityDO
import org.springframework.beans.factory.annotation.Autowired

class CityDaoTest extends BaseBootTest {
    @Autowired
    private CityDao cityDao

    def "should_save_success"() {
        given:
        CityDO city = new CityDO(name: "test_city", state: "test_state", country: "test_country")
        when:
        Long id = cityDao.save(city)
        CityDO saveCity = cityDao.selectCityById(id)
        then:
        assert Objects.nonNull(saveCity)
        assert saveCity.getName().equals(city.getName())
        assert saveCity.getState().equals(city.getState())
        assert saveCity.getCountry().equals(city.getCountry())
    }
}
