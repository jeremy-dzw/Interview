package com.hqyj.mybatiscase;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface userDao
{
    /**查找所有的用户并进行封装**/
    @Select("select * from user")
    List<userMappingClass> findAllUser();
}
