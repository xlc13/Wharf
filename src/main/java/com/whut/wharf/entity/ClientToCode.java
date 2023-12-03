package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ClientToCode {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clienttocode.code
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clienttocode.name
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String name;
}