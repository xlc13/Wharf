package com.whut.wharf.mapper;

import com.whut.wharf.entity.TugBerthNum;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("tugBerthNumMapper")
public interface TugBerthNumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugberthnum
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugberthnum
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(TugBerthNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugberthnum
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(TugBerthNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugberthnum
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    TugBerthNum selectByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugberthnum
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(TugBerthNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugberthnum
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(TugBerthNum record);
}