package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TugCandidateShipInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugcandidateshipinfo.voyageId
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String voyageid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugcandidateshipinfo.RecordUpdTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String recordupdtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugcandidateshipinfo.ShipName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shipname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugcandidateshipinfo.ShipLength
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double shiplength;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugcandidateshipinfo.ShipType
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shiptype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugcandidateshipinfo.TugNums
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer tugnums;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugcandidateshipinfo.ShipState
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shipstate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugcandidateshipinfo.Reserve
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String reserve;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugcandidateshipinfo.RouteType
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String routetype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugcandidateshipinfo.ShiptypeCode
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shiptypecode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugcandidateshipinfo.TugPlanID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tugplanid;
}