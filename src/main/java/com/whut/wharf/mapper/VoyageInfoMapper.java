package com.whut.wharf.mapper;

import com.whut.wharf.entity.VoyageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("voyageInfoMapper")
public interface VoyageInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voyageinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(String voyageid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voyageinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(VoyageInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voyageinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(VoyageInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voyageinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    VoyageInfo selectByPrimaryKey(String voyageid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voyageinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(VoyageInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voyageinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(VoyageInfo record);
}