package com.whut.wharf.mapper;

import com.whut.wharf.entity.TugCandidateShipInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("tugCandidateShipInfoMapper")
public interface TugCandidateShipInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugcandidateshipinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(String voyageid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugcandidateshipinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(TugCandidateShipInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugcandidateshipinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(TugCandidateShipInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugcandidateshipinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    TugCandidateShipInfo selectByPrimaryKey(String voyageid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugcandidateshipinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(TugCandidateShipInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugcandidateshipinfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(TugCandidateShipInfo record);
}