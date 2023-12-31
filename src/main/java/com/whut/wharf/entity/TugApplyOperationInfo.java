package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TugApplyOperationInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyoperationinfo.TugApplyID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tugapplyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyoperationinfo.VoyageID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String voyageid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyoperationinfo.OperationArea
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String operationarea;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyoperationinfo.OperationBerth
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String operationberth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyoperationinfo.TugNumberSum
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer tugnumbersum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugapplyoperationinfo.Remark
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String remark;
}