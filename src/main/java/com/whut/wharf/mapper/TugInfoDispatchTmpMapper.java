package com.whut.wharf.mapper;

import com.whut.wharf.entity.TugInfoDispatchTmp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("tugInfoDispatchTmpMapper")
public interface TugInfoDispatchTmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuginfodispatchtmp
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuginfodispatchtmp
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(TugInfoDispatchTmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuginfodispatchtmp
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(TugInfoDispatchTmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuginfodispatchtmp
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    TugInfoDispatchTmp selectByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuginfodispatchtmp
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(TugInfoDispatchTmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuginfodispatchtmp
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(TugInfoDispatchTmp record);
}