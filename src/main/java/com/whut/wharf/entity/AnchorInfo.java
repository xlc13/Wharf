package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AnchorInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column anchorinfo.AnchorName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String anchorname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column anchorinfo.Longitude
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column anchorinfo.Latitude
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column anchorinfo.Radius
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String radius;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column anchorinfo.Depth
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String depth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column anchorinfo.Substratum
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String substratum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column anchorinfo.Company
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String company;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column anchorinfo.AreaName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String areaname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column anchorinfo.Remark
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String remark;

}