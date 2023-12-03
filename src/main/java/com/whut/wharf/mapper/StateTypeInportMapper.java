package com.whut.wharf.mapper;

import com.whut.wharf.entity.StateTypeInport;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("stateTypeInportMapper")
public interface StateTypeInportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statetypeinport
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(String inportstatecode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statetypeinport
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(StateTypeInport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statetypeinport
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(StateTypeInport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statetypeinport
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    StateTypeInport selectByPrimaryKey(String inportstatecode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statetypeinport
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(StateTypeInport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statetypeinport
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(StateTypeInport record);
}