package com.whut.wharf.mapper;

import com.whut.wharf.entity.VideoTable;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("videoTableMapper")
public interface VideoTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videotable
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videotable
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(VideoTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videotable
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(VideoTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videotable
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    VideoTable selectByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videotable
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(VideoTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videotable
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(VideoTable record);
}