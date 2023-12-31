package com.whut.wharf.mapper;

import com.whut.wharf.entity.TugDividedInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("tugDividedInfoMapper")
public interface TugDividedInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugdividedinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(Integer mkeydivided);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugdividedinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(TugDividedInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugdividedinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(TugDividedInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugdividedinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    TugDividedInfo selectByPrimaryKey(Integer mkeydivided);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugdividedinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(TugDividedInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugdividedinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(TugDividedInfo record);
}