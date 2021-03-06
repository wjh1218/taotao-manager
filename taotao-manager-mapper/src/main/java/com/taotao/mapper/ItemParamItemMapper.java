package com.taotao.mapper;

import com.taotao.pojo.ItemParamItem;
import com.taotao.pojo.ItemParamItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemParamItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated
     */
    int countByExample(ItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated
     */
    int deleteByExample(ItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated
     */
    int insert(ItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated
     */
    int insertSelective(ItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated
     */
    List<ItemParamItem> selectByExampleWithBLOBs(ItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated
     */
    List<ItemParamItem> selectByExample(ItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated
     */
    ItemParamItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ItemParamItem record, @Param("example") ItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") ItemParamItem record, @Param("example") ItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ItemParamItem record, @Param("example") ItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(ItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ItemParamItem record);
}