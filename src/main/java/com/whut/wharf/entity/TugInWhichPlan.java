package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TugInWhichPlan {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tuginwhichplan.mkey
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer mkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tuginwhichplan.TugName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tugname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tuginwhichplan.TugPlanID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tugplanid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tuginwhichplan.StartUseTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Date startusetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tuginwhichplan.EndUseTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Date endusetime;
}