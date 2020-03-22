package com.ssm.farming.controller;

import com.ssm.farming.mapper.ProductMapper;
import com.ssm.farming.pojo.Product;
import com.ssm.farming.pojo.ProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductMapper productMapper;

    @RequestMapping("/listAllProducts")
    public String listAll(Model model){
        ProductExample productExample = new ProductExample();
        productExample.createCriteria().getAllCriteria();
        List<Product> products = productMapper.selectByExample(productExample);
        model.addAttribute("products",products);
        return "listProduct";
    }
}
