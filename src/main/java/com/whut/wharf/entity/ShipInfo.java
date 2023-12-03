package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ShipInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.MMSI
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer mmsi;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.ShipName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shipname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.ShipCallNum
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shipcallnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.ShipLength
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double shiplength;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.ShipWidth
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double shipwidth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.ShipDraft
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double shipdraft;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.ShipType
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shiptype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.ShipnType
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer shipntype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.IMO
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer imo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.Destination
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String destination;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.ArriveTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String arrivetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.Latitude
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.Longitude
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.Speed
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double speed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.dynState
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer dynstate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.ShipAngle
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double shipangle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.TraceAngle
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double traceangle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.UpdateTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String updatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.Online
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Byte online;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.regShip
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer regship;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.voyage
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String voyage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.IsVoyageFinished
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Byte isvoyagefinished;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.shipState
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer shipstate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.stateDesc
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String statedesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.berthPlanID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer berthplanid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.berthPlanName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String berthplanname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.berthID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer berthid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.anchorID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer anchorid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.meetAreaID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer meetareaid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.isInPort
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer isinport;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.inPortTM
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String inporttm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.outPortTM
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String outporttm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.isInBerth
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer isinberth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.inBerthTM
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String inberthtm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.outBerthTM
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String outberthtm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipinfo.ChineseName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String chinesename;
}