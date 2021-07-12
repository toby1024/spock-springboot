package com.example.base

import com.example.spockspringboot.SpockSpringbootApplication
import com.example.spockspringboot.infrastructure.adapter.repository.dao.CityDao
import com.example.spockspringboot.infrastructure.adapter.repository.dataobject.CityDO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Rollback
import org.springframework.transaction.annotation.Transactional
import spock.lang.Shared
import spock.lang.Specification

@Transactional
@Rollback
@SpringBootTest(classes = SpockSpringbootApplication.class)
class BaseBootTest extends Specification {
    @Autowired
    CityDao cityDao
    @Shared
    CityDO baseCity
    @Shared
    def baseCityId

    void setup() {
        baseCity = new CityDO(name: "base_test_city", state: "base_test_state", country: "base_test_country")
        baseCityId = cityDao.save(baseCity)
    }
}
