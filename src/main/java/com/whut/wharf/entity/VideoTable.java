package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class VideoTable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column videotable.mKey
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer mkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column videotable.deviceName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String devicename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column videotable.channelNo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String channelno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column videotable.channelName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String channelname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column videotable.updateName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String updatename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column videotable.url
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column videotable.status
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column videotable.deviceSerial
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String deviceserial;
}