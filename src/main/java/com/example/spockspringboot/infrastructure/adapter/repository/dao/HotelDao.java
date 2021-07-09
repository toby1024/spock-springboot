package com.example.spockspringboot.infrastructure.adapter.repository.dao;

import com.example.spockspringboot.infrastructure.adapter.repository.dataobject.HotelDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface HotelDao {

    Long save(HotelDO hotelDO);

    HotelDO selectByCityId(Long cityId);

    HotelDO selectById(Long id);
}
