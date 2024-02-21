package com.ohgiraffers.section02.javaConfig;

import org.apache.ibatis.annotations.*;

import java.util.List;

public interface MenuMapper {

    @Results(id = "menuResultMap", value = {
            @Result(id = true, property = "menuCode", column = "menu_code"),
            @Result(id = true, property = "menuName", column = "menu_name"),
            @Result(id = true, property = "menuPrice", column = "menu_price"),
            @Result(id = true, property = "categoryCode", column = "category_code"),
            @Result(id = true, property = "orderableStatus", column = "orderable_status"),
    })
    @Select("""
            select
                    menu_code
                    , menu_name
                    , menu_price
                    , category_code
                    , orderable_status
                    from tbl_menu""")
    List<MenuDTO> selectAllMenus();

    @Select("""
            select
            menu_code
            , menu_name
            , menu_price
            , category_code
            , orderable_status
            from tbl_menu
            where menu_code = #{menuCode}""")
    @ResultMap("menuResultMap")
    MenuDTO selectMenuByMenuCode(int menuCode);

    @Insert("""
            insert
                  into tbl_menu (
                       menu_name
                     , menu_price
                     , category_code
                     , orderable_status
                     )
                     values (
                        #{menuName}
                      , #{menuPrice}
                      , #{categoryCode}
                      , 'Y')""")
    int insertMenu(MenuDTO menu);

    @Update("""
            update
                   tbl_menu
               set menu_name = #{menuName}
                 , menu_price = #{menuPrice}
             where menu_code = #{menuCode}""")
    int updateMenu(MenuDTO menu);

    @Delete("""
            delete
              from tbl_menu
             where menu_code = #{menuCode}""")
    int deleteMenu(int menuCode);
}
