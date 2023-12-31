package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TugInfoAll {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tuginfoall.TugName
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String tugname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tuginfoall.IsUsed
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String isused;
}