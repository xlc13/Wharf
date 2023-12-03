package com.whut.wharf.mapper;

import com.whut.wharf.entity.TestA;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("testAMapper")
public interface TestAMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_a
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(String mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_a
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(TestA record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_a
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(TestA record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_a
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    TestA selectByPrimaryKey(String mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_a
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(TestA record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_a
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(TestA record);
}