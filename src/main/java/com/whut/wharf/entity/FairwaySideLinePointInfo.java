package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FairwaySideLinePointInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fairwaysidelinepointinfo.PointNumber
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer pointnumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fairwaysidelinepointinfo.LineID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer lineid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fairwaysidelinepointinfo.FairwayID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer fairwayid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fairwaysidelinepointinfo.PointLongtitude
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double pointlongtitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fairwaysidelinepointinfo.PointLatitude
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double pointlatitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fairwaysidelinepointinfo.Remark
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fairwaysidelinepointinfo.Reserve
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String reserve;
}