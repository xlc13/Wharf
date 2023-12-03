package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AreaInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column areainfo.AreaName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String areaname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column areainfo.longitude
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column areainfo.latitude
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column areainfo.description
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column areainfo.num
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column areainfo.abbr
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String abbr;

}