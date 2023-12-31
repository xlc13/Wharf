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
public class VoyageInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.voyageID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String voyageid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.voyage
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String voyage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.RegistrationDate
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String registrationdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.PlanDate
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String plandate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.MMSI
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String mmsi;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.ShipName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shipname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.ChineseName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String chinesename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.ShipImage
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shipimage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.ShipCallNum
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shipcallnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.ShipIMO
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shipimo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.ShipIC
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shipic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.Nationality
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String nationality;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.ShipLength
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double shiplength;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.ShipWidth
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double shipwidth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.GrossTon
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double grosston;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.NetTon
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double netton;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.DeadweightTon
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double deadweightton;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.ShipType
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shiptype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.ShipTypeCode
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shiptypecode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.Longitude
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.Latitude
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.Speed
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double speed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.DirectionAngle
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String directionangle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.UpdateTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Date updatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.Online
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String online;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.Alarm
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String alarm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.InPort
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String inport;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.TradeIntFor
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tradeintfor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.StartPort
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String startport;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.PreviousPort
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String previousport;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.NextPort
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String nextport;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.ArrivalHD
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double arrivalhd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.ArrivalCD
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double arrivalcd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.ArrivalTD
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double arrivaltd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.DepartureHD
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double departurehd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.DepartureCD
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double departurecd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.DepartureTD
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double departuretd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.Dispath
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String dispath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.OperationCompany
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String operationcompany;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.PreArrivalTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Date prearrivaltime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.PreDepartureTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Date predeparturetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.InOrExport
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String inorexport;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.ApplicationUnit
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String applicationunit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.PreBerthName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String preberthname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.ShipNumber
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shipnumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.CargoName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String cargoname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.CargoOwner
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String cargoowner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.FreightForwarding
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String freightforwarding;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.CargoNumber
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer cargonumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.CargoWeight
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double cargoweight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.CargoVolume
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double cargovolume;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.ShipAgent
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shipagent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.ShipCompany
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shipcompany;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.Warnings
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String warnings;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.CurrentState
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String currentstate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.StateUpdateTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Date stateupdatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.Reserve1
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String reserve1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voyageinfo.Reserve2
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String reserve2;
}