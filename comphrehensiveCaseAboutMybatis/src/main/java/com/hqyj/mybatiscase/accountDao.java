package com.hqyj.mybatiscase;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface accountDao
{
    /**查找所有的账户并进行封装**/
    @Select("select * from account")
    List<accountMappingClass> findAllAccount();
}
