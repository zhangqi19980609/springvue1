package com.example.springvue1.Dao;

import com.example.springvue1.pojo.HomeZhu;

public interface HomeZhuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table homezhu
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Byte hid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table homezhu
     *
     * @mbggenerated
     */
    int insert(HomeZhu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table homezhu
     *
     * @mbggenerated
     */
    int insertSelective(HomeZhu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table homezhu
     *
     * @mbggenerated
     */
    HomeZhu selectByPrimaryKey(Byte hid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table homezhu
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(HomeZhu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table homezhu
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(HomeZhu record);
}