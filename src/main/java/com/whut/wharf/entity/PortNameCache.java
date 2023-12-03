package com.whut.wharf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PortNameCache {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portnamecache.id
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portnamecache.name
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    private String name;
}