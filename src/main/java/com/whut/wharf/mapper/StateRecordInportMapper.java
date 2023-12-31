package com.whut.wharf.mapper;

import com.whut.wharf.entity.StateRecordInport;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("stateRecordInportMapper")
public interface StateRecordInportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staterecordinport
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(StateRecordInport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staterecordinport
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(StateRecordInport record);
}