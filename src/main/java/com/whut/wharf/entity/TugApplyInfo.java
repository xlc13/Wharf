package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TugApplyInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.TugApplyID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tugapplyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.TugApplyDate
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tugapplydate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.voyageID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String voyageid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.RouteType
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String routetype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.CreditLevel
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String creditlevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.TugOperationArea
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tugoperationarea;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.TugOperationType
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tugoperationtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.GoBerth
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String goberth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.StartTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Date starttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.DraftTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Date drafttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.UnshipTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Date unshiptime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.EndTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Date endtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.TugOperationTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tugoperationtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.DayOrNight
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String dayornight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.RateStandard
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String ratestandard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.IsAuditing
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String isauditing;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.AuditPerson
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String auditperson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.IsAgree
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String isagree;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.AuditTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Date audittime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.Reserve
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String reserve;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.AuditReason
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String auditreason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.Reserve2
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String reserve2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.CreditProof
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String creditproof;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyinfo.InShipWay
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String inshipway;
}