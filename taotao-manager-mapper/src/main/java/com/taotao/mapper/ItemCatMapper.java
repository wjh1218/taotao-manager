package com.taotao.mapper;

import com.taotao.pojo.ItemCat;
import tk.mybatis.mapper.common.Mapper;

public interface ItemCatMapper extends Mapper<ItemCat> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * 
     */
    int insert(ItemCat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_cat
     *
     * 
     */
    int insertSelective(ItemCat record);
}