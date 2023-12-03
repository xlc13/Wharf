package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TugDividedInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugdividedinfo.MkeyDivided
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer mkeydivided;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugdividedinfo.Mkey
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer mkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugdividedinfo.TugApplyID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tugapplyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugdividedinfo.VoyageID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String voyageid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugdividedinfo.TugName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tugname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugdividedinfo.TugType
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tugtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugdividedinfo.Remark
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String remark;
}