package com.whut.wharf.mapper;

import com.whut.wharf.entity.WeatherInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("weatherInfoMapper")
public interface WeatherInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weatherinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(Integer stationid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weatherinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(WeatherInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weatherinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(WeatherInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weatherinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    WeatherInfo selectByPrimaryKey(Integer stationid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weatherinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(WeatherInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weatherinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(WeatherInfo record);
}