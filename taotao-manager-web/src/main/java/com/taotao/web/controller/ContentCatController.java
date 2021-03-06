package com.taotao.web.controller;

import com.taotao.common.util.TaotaoResult;
import com.taotao.service.ContentCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/content/category")
public class ContentCatController {
	@Autowired
	private ContentCatService contentCatService;
	@RequestMapping("/list")
	public List<Map<String,Object>> getContentCatList(@RequestParam(value = "id",defaultValue = "0")long parentId){
		List<Map<String, Object>> contentCatList = contentCatService.getContentCatList(parentId);
		return contentCatList;
	}
	@RequestMapping("/create")
	public TaotaoResult createContentCat(long parentId,String name){
		TaotaoResult tataoResult= contentCatService.createContentCat(parentId, name);
		return tataoResult;
	}
	@RequestMapping("/update")
	public void updateContentCat(long id,String name){
		contentCatService.updateContentCat(id,name);
	}
	@RequestMapping("/delete")
	public void deleteContentCat(Long parentId,Long id){
		System.out.println(parentId+ " "+id);
		contentCatService.deleteContentCat(parentId, id);
	}
}
