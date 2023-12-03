package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExtraCharge {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column extracharge.Mkey
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer mkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column extracharge.shipName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shipname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column extracharge.startTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String starttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column extracharge.endTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String endtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column extracharge.Operation
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String operation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column extracharge.Tug
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tug;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column extracharge.cost
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String cost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column extracharge.SAC
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String sac;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column extracharge.costRemark
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String costremark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column extracharge.reverse1
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String reverse1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column extracharge.reverse2
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String reverse2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column extracharge.reverse3
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String reverse3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column extracharge.TugApplyID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tugapplyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column extracharge.OperationLoc
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String operationloc;
}