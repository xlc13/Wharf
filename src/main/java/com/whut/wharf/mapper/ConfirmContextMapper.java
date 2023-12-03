package com.whut.wharf.mapper;

import com.whut.wharf.entity.ConfirmContext;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("confirmContextMapper")
public interface ConfirmContextMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table confirmcontext
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(ConfirmContext record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table confirmcontext
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(ConfirmContext record);
}