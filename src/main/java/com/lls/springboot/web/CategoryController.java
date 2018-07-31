package com.lls.springboot.web;
import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lls.springboot.mapper.CategoryMapper;
import com.lls.springboot.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    @Autowired
    CategoryMapper categoryMapper;

    @RequestMapping(value = "/listCategory")
    public PageInfo listCategory(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Category> list = categoryMapper.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }
     
}