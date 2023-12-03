package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Appversion {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column appversion.mkey
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer mkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column appversion.version
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column appversion.downloadLink
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String downloadlink;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column appversion.uploadTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String uploadtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column appversion.isHead
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String ishead;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column appversion.qrCode
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String qrcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column appversion.versionLog
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String versionlog;
}