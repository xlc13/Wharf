package com.whut.wharf.mapper;

import com.whut.wharf.entity.UserInfoSa;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("userInfoSaMapper")
public interface UserInfoSaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfosa
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfosa
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(UserInfoSa record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfosa
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(UserInfoSa record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfosa
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    UserInfoSa selectByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfosa
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(UserInfoSa record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfosa
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(UserInfoSa record);
}