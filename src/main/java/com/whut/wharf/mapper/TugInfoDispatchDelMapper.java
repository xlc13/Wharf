package com.whut.wharf.mapper;

import com.whut.wharf.entity.TugInfoDispatchDel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("tugInfoDispatchDelMapper")
public interface TugInfoDispatchDelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuginfodispatchdel
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(TugInfoDispatchDel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuginfodispatchdel
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(TugInfoDispatchDel record);
}