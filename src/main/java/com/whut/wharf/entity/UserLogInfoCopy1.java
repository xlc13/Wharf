package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserLogInfoCopy1 {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userloginfo_copy1.logkey
     *
     * @mbggenerated Sun Dec 03 17:16:55 CST 2023
     */
    private Integer logkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userloginfo_copy1.userid
     *
     * @mbggenerated Sun Dec 03 17:16:55 CST 2023
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userloginfo_copy1.accountName
     *
     * @mbggenerated Sun Dec 03 17:16:55 CST 2023
     */
    private String accountname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userloginfo_copy1.logtime
     *
     * @mbggenerated Sun Dec 03 17:16:55 CST 2023
     */
    private String logtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userloginfo_copy1.loglIP
     *
     * @mbggenerated Sun Dec 03 17:16:55 CST 2023
     */
    private String loglip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userloginfo_copy1.logresult
     *
     * @mbggenerated Sun Dec 03 17:16:55 CST 2023
     */
    private String logresult;
}