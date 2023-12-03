package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TugFileInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugfileinfo.TugApplyID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tugapplyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugfileinfo.FileID
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String fileid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugfileinfo.reserve1
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String reserve1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugfileinfo.reserve2
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String reserve2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugfileinfo.reserve3
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String reserve3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tugfileinfo.reserve4
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String reserve4;
}