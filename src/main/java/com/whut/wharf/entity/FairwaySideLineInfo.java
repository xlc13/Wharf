package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FairwaySideLineInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fairwaysidelineinfo.LineID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer lineid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fairwaysidelineinfo.FairwayID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer fairwayid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fairwaysidelineinfo.LineType
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String linetype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fairwaysidelineinfo.Remark
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fairwaysidelineinfo.Reserve
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String reserve;
}