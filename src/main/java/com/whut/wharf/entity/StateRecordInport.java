package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StateRecordInport {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staterecordinport.mKey
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer mkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staterecordinport.MMSI
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String mmsi;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staterecordinport.EnglishName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String englishname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staterecordinport.ChineseName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String chinesename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staterecordinport.Message
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String message;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staterecordinport.UpdateTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String updatetime;
}