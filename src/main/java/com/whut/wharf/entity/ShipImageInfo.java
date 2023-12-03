package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ShipImageInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipimageinfo.mkey
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer mkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipimageinfo.ShipName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shipname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipimageinfo.MMSI
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String mmsi;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipimageinfo.ShipImagePath
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String shipimagepath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipimageinfo.Reserve
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String reserve;
}