package com.whut.wharf.mapper;

import com.whut.wharf.entity.BerthPos;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("berthPosMapper")
public interface BerthPosMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table berthpos
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(BerthPos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table berthpos
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(BerthPos record);
}