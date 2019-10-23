package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {
    private ProductService productService =new ProductServiceImpl();
    @GetMapping("/home")
    public String index(Model model){
        model.addAttribute("product",productService.findAll());
        return "index";
    }
    //phương thức create hiển  thị creat
    @GetMapping("/product/create")
        public String create(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }
    //tao phuong thuc luu mot customer
    @PostMapping("/product/save")
    public String save(Product product, RedirectAttributes redirect){
        product.setId((int)(Math.random()*1000));
        productService.save(product);
        redirect.addAttribute("success","Save product success!");
        return "redirect:/home";
    }
}
