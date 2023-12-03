package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OperationInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationinfo.Mkey
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer mkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationinfo.OperationName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String operationname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationinfo.OperationType
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String operationtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationinfo.ChargeStandard
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String chargestandard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationinfo.Remark
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationinfo.abbr
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String abbr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationinfo.disable
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String disable;
}