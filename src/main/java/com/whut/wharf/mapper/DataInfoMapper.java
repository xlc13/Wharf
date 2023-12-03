package com.whut.wharf.mapper;

import com.whut.wharf.entity.DataInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("dataInfoMapper")
public interface DataInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table datainfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(String dataid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table datainfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(DataInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table datainfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(DataInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table datainfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    DataInfo selectByPrimaryKey(String dataid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table datainfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(DataInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table datainfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(DataInfo record);
}