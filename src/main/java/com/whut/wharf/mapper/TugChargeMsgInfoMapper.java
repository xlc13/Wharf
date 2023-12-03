package com.whut.wharf.mapper;

import com.whut.wharf.entity.TugChargeMsgInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("tugChargeMsgInfoMapper")
public interface TugChargeMsgInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugchargemsginfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int deleteByPrimaryKey(String tugapplyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugchargemsginfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insert(TugChargeMsgInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugchargemsginfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int insertSelective(TugChargeMsgInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugchargemsginfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    TugChargeMsgInfo selectByPrimaryKey(String tugapplyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugchargemsginfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeySelective(TugChargeMsgInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugchargemsginfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(TugChargeMsgInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tugchargemsginfo
     *
     * @mbggenerated Sun Dec 03 17:13:30 CST 2023
     */
    int updateByPrimaryKey(TugChargeMsgInfo record);
}