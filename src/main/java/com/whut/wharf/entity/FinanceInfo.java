package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FinanceInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financeinfo.mKey
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer mkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financeinfo.requestTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String requesttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financeinfo.systemName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String systemname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financeinfo.content
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financeinfo.formNumber
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String formnumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financeinfo.state
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financeinfo.tugApplyId
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tugapplyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financeinfo.nextStr
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String nextstr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financeinfo.cost
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double cost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financeinfo.withoutTaxCost
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private BigDecimal withouttaxcost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financeinfo.uuid
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String uuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financeinfo.combine
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String combine;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financeinfo.associatedNum
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String associatednum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financeinfo.itemCost
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double itemcost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financeinfo.itemWithoutTaxCost
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private BigDecimal itemwithouttaxcost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financeinfo.receiptTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String receipttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financeinfo.isEstimate
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String isestimate;
}