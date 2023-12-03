package com.whut.wharf.mapper;

import com.whut.wharf.entity.TugInfoDispatch;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("tugInfoDispatchMapper")
public interface TugInfoDispatchMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuginfodispatch
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuginfodispatch
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(TugInfoDispatch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuginfodispatch
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(TugInfoDispatch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuginfodispatch
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    TugInfoDispatch selectByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuginfodispatch
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(TugInfoDispatch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuginfodispatch
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(TugInfoDispatch record);
}