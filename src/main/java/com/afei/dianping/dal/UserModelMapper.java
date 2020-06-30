package com.afei.dianping.dal;

import com.afei.dianping.model.UserModel;
import org.apache.ibatis.annotations.Param;

public interface UserModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Jun 06 21:03:30 GMT+08:00 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Jun 06 21:03:30 GMT+08:00 2020
     */
    int insert(UserModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Jun 06 21:03:30 GMT+08:00 2020
     */
    int insertSelective(UserModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Jun 06 21:03:30 GMT+08:00 2020
     */
    UserModel selectByPrimaryKey(Integer id);

    /**
     * select user info by telphone and password
     * this method is used to login
     */
    UserModel selectByTelphoneAndPassword(@Param("telphone") String telphone,
                                          @Param("password") String password);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Jun 06 21:03:30 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(UserModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Jun 06 21:03:30 GMT+08:00 2020
     */
    int updateByPrimaryKey(UserModel record);

    Integer countAllUser();
}