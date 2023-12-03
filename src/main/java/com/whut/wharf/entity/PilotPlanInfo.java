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
public class PilotPlanInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pilotplaninfo.PioltPlanID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String pioltplanid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pilotplaninfo.voyageID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String voyageid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pilotplaninfo.MMSI
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String mmsi;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pilotplaninfo.ShipName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shipname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pilotplaninfo.MaxDraft
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double maxdraft;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pilotplaninfo.ShipLength
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double shiplength;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pilotplaninfo.ShipWidth
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double shipwidth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pilotplaninfo.ShipType
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shiptype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pilotplaninfo.PilotPerson
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String pilotperson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pilotplaninfo.InShipWay
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String inshipway;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pilotplaninfo.IsNeedTug
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String isneedtug;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pilotplaninfo.TugNumber
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer tugnumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pilotplaninfo.InShipTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Date inshiptime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pilotplaninfo.InShipDes
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String inshipdes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pilotplaninfo.ExecutionState
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String executionstate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pilotplaninfo.UpdateTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Date updatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pilotplaninfo.planDate
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String plandate;
}