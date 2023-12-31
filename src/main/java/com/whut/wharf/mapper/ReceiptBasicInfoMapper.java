package com.whut.wharf.mapper;

import com.whut.wharf.entity.ReceiptBasicInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("receiptBasicInfoMapper")
public interface ReceiptBasicInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table receiptbasicinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table receiptbasicinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(ReceiptBasicInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table receiptbasicinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(ReceiptBasicInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table receiptbasicinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    ReceiptBasicInfo selectByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table receiptbasicinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(ReceiptBasicInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table receiptbasicinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(ReceiptBasicInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table receiptbasicinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(ReceiptBasicInfo record);
}