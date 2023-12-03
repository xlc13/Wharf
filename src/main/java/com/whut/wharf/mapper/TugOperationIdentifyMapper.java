package com.whut.wharf.mapper;

import com.whut.wharf.entity.TugOperationIdentify;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("tugOperationIdentifyMapper")
public interface TugOperationIdentifyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugoperationidentify
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(String tugoperationid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugoperationidentify
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(TugOperationIdentify record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugoperationidentify
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(TugOperationIdentify record);
}