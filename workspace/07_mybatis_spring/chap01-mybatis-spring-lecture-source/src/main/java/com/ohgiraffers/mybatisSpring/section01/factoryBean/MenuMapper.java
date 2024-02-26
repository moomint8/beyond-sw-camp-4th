package com.ohgiraffers.mybatisSpring.section01.factoryBean;

import java.util.List;

public interface MenuMapper {
    List<MenuDTO> selectAllManuByOrderableStatus(String orderableStatus);
}
