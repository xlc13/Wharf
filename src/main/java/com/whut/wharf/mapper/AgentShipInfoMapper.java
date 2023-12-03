package com.whut.wharf.mapper;

import com.whut.wharf.entity.AgentShipInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("agentShipInfoMapper")
public interface AgentShipInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agentshipinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agentshipinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(AgentShipInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agentshipinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(AgentShipInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agentshipinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    AgentShipInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agentshipinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(AgentShipInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agentshipinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(AgentShipInfo record);
}