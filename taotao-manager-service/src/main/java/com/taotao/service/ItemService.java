package com.taotao.service;

import com.github.pagehelper.PageInfo;
import com.taotao.pojo.Item;

import java.util.Map;

/**
 * ItemServiceImpl class
 *
 * @author wjh
 * @date 2018/11/7
 */

public interface ItemService {
	Map<String,Object> findItems(int pageNum, int pageSize);
}
