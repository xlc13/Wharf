package com.whut.wharf.mapper;

import com.whut.wharf.entity.PilotPlanHistoryInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("pilotPlanHistoryInfoMapper")
public interface PilotPlanHistoryInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pilotplanhistoryinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pilotplanhistoryinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(PilotPlanHistoryInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pilotplanhistoryinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(PilotPlanHistoryInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pilotplanhistoryinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    PilotPlanHistoryInfo selectByPrimaryKey(Integer mkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pilotplanhistoryinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(PilotPlanHistoryInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pilotplanhistoryinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(PilotPlanHistoryInfo record);
}