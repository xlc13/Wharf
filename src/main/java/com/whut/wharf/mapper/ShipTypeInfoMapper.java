package com.whut.wharf.mapper;

import com.whut.wharf.entity.ShipTypeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("shipTypeInfoMapper")
public interface ShipTypeInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiptypeinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiptypeinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(ShipTypeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiptypeinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(ShipTypeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiptypeinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    ShipTypeInfo selectByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiptypeinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(ShipTypeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiptypeinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(ShipTypeInfo record);
}