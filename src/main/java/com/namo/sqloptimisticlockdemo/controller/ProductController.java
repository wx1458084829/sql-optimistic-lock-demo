package com.namo.sqloptimisticlockdemo.controller;

import com.namo.sqloptimisticlockdemo.entity.Product;
import com.namo.sqloptimisticlockdemo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author namo
 * @since 2022-08-02
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    IProductService iProductService;

    @GetMapping("/list")
    public List<Product> getProducts() {
        List<Product> list = iProductService.list();
        return list;
    }


    @PostMapping("/price/add/{price}")
    public Product addPrice(@PathVariable("price") Integer price) {
        Product product = iProductService.getById(1L);
        product.setPrice(product.getPrice() + price);
        boolean save = iProductService.saveOrUpdate(product);
        System.out.println("修改为：" + product);
        return product;
    }

}
