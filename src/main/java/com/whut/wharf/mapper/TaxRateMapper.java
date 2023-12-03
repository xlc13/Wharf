package com.whut.wharf.mapper;

import com.whut.wharf.entity.TaxRate;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("taxRateMapper")
public interface TaxRateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table taxrate
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table taxrate
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(TaxRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table taxrate
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(TaxRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table taxrate
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    TaxRate selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table taxrate
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(TaxRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table taxrate
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(TaxRate record);
}