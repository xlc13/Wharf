package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OperationChargeDetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationchargedetail.Mkey
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer mkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationchargedetail.TugApplyID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tugapplyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationchargedetail.OperationName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String operationname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationchargedetail.TugNums
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer tugnums;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationchargedetail.Costs
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double costs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationchargedetail.Remark
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationchargedetail.Flag
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String flag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationchargedetail.AuditTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String audittime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationchargedetail.ApplyMkey
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String applymkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationchargedetail.CalculateCost
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double calculatecost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationchargedetail.CalculateUnitCost
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double calculateunitcost;
}