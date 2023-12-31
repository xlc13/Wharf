package com.whut.wharf.mapper;

import com.whut.wharf.entity.BerthPlanIdentify;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("berthPlanIdentifyMapper")
public interface BerthPlanIdentifyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table berthplanidentify
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(String berthplanid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table berthplanidentify
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(BerthPlanIdentify record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table berthplanidentify
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(BerthPlanIdentify record);
}