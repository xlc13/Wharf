package com.whut.wharf.entity;

import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class FinanceInfoWithBLOBs extends FinanceInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financeinfo.body
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String body;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financeinfo.responseBody
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String responsebody;
}