package com.example.spockspringboot.infrastructure.adapter.repository.dao;

import com.example.spockspringboot.infrastructure.adapter.repository.dataobject.CityDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CityDao {
    Long save(CityDO cityDO);
    CityDO selectCityById(Long id);
}
