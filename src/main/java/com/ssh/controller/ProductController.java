package com.ssh.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ssh.entity.Product;
import com.ssh.entity.Result;
import com.ssh.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Cinzia
 * @Description 商品Controller
 * @Date 2023/8/8 4:01
 * @Version 1.0
 */
@Api(tags = "商品管理")
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    /**
     * 查询轮播图
     * @return
     */
    @ApiOperation(value = "查询轮播图",notes = "查询轮播图")
    @GetMapping("/findSwiper")
    public Result findSwiper(){
        List<Product> swiperProductList = productService.list(new QueryWrapper<Product>().eq("is_swiper", true).orderByAsc("swiper_sort"));
        Map<String, Object> map = new HashMap<>();
        map.put("message",swiperProductList);
        return Result.success(map);
    }

}
