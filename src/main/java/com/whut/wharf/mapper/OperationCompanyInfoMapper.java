package com.whut.wharf.mapper;

import com.whut.wharf.entity.OperationCompanyInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("operationCompanyInfoMapper")
public interface OperationCompanyInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operationcompanyinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(String opecompanycode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operationcompanyinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(OperationCompanyInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operationcompanyinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(OperationCompanyInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operationcompanyinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    OperationCompanyInfo selectByPrimaryKey(String opecompanycode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operationcompanyinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(OperationCompanyInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operationcompanyinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(OperationCompanyInfo record);
}