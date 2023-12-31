package com.whut.wharf.mapper;

import com.whut.wharf.entity.DispatcherInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("dispatcherInfoMapper")
public interface DispatcherInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dispatcherinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(DispatcherInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dispatcherinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(DispatcherInfo record);
}