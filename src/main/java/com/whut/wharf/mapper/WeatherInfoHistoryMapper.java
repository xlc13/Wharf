package com.whut.wharf.mapper;

import com.whut.wharf.entity.WeatherInfoHistory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("weatherInfoHistoryMapper")
public interface WeatherInfoHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weatherinfohistory
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(Integer weathernumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weatherinfohistory
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(WeatherInfoHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weatherinfohistory
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(WeatherInfoHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weatherinfohistory
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    WeatherInfoHistory selectByPrimaryKey(Integer weathernumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weatherinfohistory
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(WeatherInfoHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weatherinfohistory
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(WeatherInfoHistory record);
}