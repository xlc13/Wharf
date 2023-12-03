package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TugApplyOpeContent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyopecontent.Mkey
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer mkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyopecontent.TugApplyID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tugapplyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyopecontent.VoyageID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String voyageid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyopecontent.OperationName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String operationname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyopecontent.OperationTime
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String operationtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyopecontent.OperationLoc
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String operationloc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyopecontent.TugNumber
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer tugnumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyopecontent.Remark
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String remark;
}