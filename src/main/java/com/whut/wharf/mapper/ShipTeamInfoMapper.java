package com.whut.wharf.mapper;

import com.whut.wharf.entity.ShipTeamInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("shipTeamInfoMapper")
public interface ShipTeamInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipteaminfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(String teamid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipteaminfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(ShipTeamInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipteaminfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(ShipTeamInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipteaminfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    ShipTeamInfo selectByPrimaryKey(String teamid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipteaminfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(ShipTeamInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipteaminfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(ShipTeamInfo record);
}