package com.whut.wharf.mapper;

import com.whut.wharf.entity.TugScoreInfoCopy1;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("tugScoreInfoCopy1Mapper")
public interface TugScoreInfoCopy1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugscoreinfo_copy1
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugscoreinfo_copy1
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(TugScoreInfoCopy1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugscoreinfo_copy1
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(TugScoreInfoCopy1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugscoreinfo_copy1
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    TugScoreInfoCopy1 selectByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugscoreinfo_copy1
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(TugScoreInfoCopy1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugscoreinfo_copy1
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(TugScoreInfoCopy1 record);
}