package com.whut.wharf.mapper;

import com.whut.wharf.entity.BerthinInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("berthinInfoMapper")
public interface BerthinInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table berthinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(String berthname);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table berthinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(BerthinInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table berthinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(BerthinInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table berthinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    BerthinInfo selectByPrimaryKey(String berthname);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table berthinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(BerthinInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table berthinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(BerthinInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table berthinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(BerthinInfo record);
}