package com.ssh.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ssh.entity.Product;
import com.ssh.service.ProductService;
import com.ssh.mapper.ProductMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author Cinzia
* @description 商品Service实现类
* @createDate 2023-08-04 16:57:44
*/
@Service("productService")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService{
    @Resource
    private ProductMapper productMapper;
}




