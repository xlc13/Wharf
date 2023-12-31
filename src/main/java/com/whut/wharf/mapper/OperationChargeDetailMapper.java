package com.whut.wharf.mapper;

import com.whut.wharf.entity.OperationChargeDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("operationChargeDetailMapper")
public interface OperationChargeDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operationchargedetail
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operationchargedetail
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(OperationChargeDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operationchargedetail
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(OperationChargeDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operationchargedetail
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    OperationChargeDetail selectByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operationchargedetail
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(OperationChargeDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operationchargedetail
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(OperationChargeDetail record);
}