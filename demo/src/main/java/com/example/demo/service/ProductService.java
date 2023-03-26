package com.example.demo.service;


import com.example.demo.dto.ProductDeleteResponse;
import com.example.demo.dto.ProductRequest;
import com.example.demo.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    List<ProductResponse> getAllProducts();
    ProductResponse save(ProductRequest productRequest);
    ProductResponse update(Long id, ProductRequest productRequest);

    ProductResponse getById(Long id);
    ProductDeleteResponse delete(Long id);
}
