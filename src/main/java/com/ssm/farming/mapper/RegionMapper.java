package com.ssm.farming.mapper;

import com.ssm.farming.pojo.Region;
import com.ssm.farming.pojo.RegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_region
     *
     * @mbggenerated
     */
    int countByExample(RegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_region
     *
     * @mbggenerated
     */
    int deleteByExample(RegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_region
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_region
     *
     * @mbggenerated
     */
    int insert(Region record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_region
     *
     * @mbggenerated
     */
    int insertSelective(Region record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_region
     *
     * @mbggenerated
     */
    List<Region> selectByExample(RegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_region
     *
     * @mbggenerated
     */
    Region selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_region
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Region record, @Param("example") RegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_region
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Region record, @Param("example") RegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_region
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Region record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_region
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Region record);
}