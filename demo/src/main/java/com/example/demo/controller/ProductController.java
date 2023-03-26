package com.example.demo.controller;

import com.example.demo.dto.ProductDeleteResponse;
import com.example.demo.dto.ProductRequest;
import com.example.demo.dto.ProductResponse;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("api/gadgetarium/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<ProductResponse>AllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping
    public ProductResponse save(@RequestBody ProductRequest productRequest){
       return productService.save(productRequest);
    }

    @GetMapping("/{id}")
    public ProductResponse getById (@PathVariable("id") Long id){
        return productService.getById(id);
    }

    @PutMapping("/{id}")
    public  ProductResponse update(@PathVariable("id") Long id, @RequestBody ProductRequest productRequest){
        return productService.update(id,productRequest);
    }

    @DeleteMapping("/{id}")
    public ProductDeleteResponse delete(@PathVariable("id") Long id){
        return productService.delete(id);
    }
}
