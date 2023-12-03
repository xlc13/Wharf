package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OperationCompanyInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationcompanyinfo.OpeCompanyCode
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String opecompanycode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operationcompanyinfo.OpeCompanyName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String opecompanyname;
}