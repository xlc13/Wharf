package com.whut.wharf.entity;

import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TugDispatchUserInfo extends TugDispatchUserInfoKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugdispatchuserinfo.PassWord
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugdispatchuserinfo.Remark
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugdispatchuserinfo.TugName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tugname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugdispatchuserinfo.Driver
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String driver;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugdispatchuserinfo.DriverTel
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String drivertel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugdispatchuserinfo.Reserve
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String reserve;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugdispatchuserinfo.isEnabled
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Byte isenabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugdispatchuserinfo.UserType
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String usertype;
}