package com.taotao.web.controller;

import com.github.pagehelper.PageInfo;
import com.taotao.pojo.Item;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ItemController class
 *
 * @author wjh
 * @date 2018/11/7
 */
@RestController
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private ItemService itemService;

	@RequestMapping("/list")
	public Map<String ,Object> getItemlist(@RequestParam(defaultValue="1")Integer pageNum,
									@RequestParam(defaultValue="30")Integer pageSize) throws Exception {
		//查询商品列表
		Map<String, Object> map = itemService.findItems(pageNum, pageSize);
		return map;
	}
}

