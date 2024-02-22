package com.ohgiraffers.section01.javaConfig;

import org.apache.ibatis.annotations.Select;

import java.util.Date;

public interface Mapper {

    @Select("SELECT NOW()")
    Date selectNow();
}
