package com.whut.wharf.mapper;

import com.whut.wharf.entity.BerthStateRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("berthStateRecordMapper")
public interface BerthStateRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table berthstaterecord
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table berthstaterecord
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(BerthStateRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table berthstaterecord
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(BerthStateRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table berthstaterecord
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    BerthStateRecord selectByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table berthstaterecord
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(BerthStateRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table berthstaterecord
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(BerthStateRecord record);
}