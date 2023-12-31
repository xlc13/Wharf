package com.whut.wharf.mapper;

import com.whut.wharf.entity.WeatherInfoHis;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("weatherInfoHisMapper")
public interface WeatherInfoHisMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weatherinfohis
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(WeatherInfoHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weatherinfohis
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(WeatherInfoHis record);
}