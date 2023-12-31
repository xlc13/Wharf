package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Pattern {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pattern.patternID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer patternid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pattern.Longitude
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pattern.Latitude
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Double latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pattern.isLine
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Byte isline;
}