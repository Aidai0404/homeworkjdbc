package com.example.demo.service;


import com.example.demo.dto.ProductDeleteResponse;
import com.example.demo.dto.ProductAddRequest;
import com.example.demo.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    List<ProductResponse> getAllProducts();
    ProductResponse save(ProductAddRequest productRequest);
    ProductResponse update(Long id, ProductAddRequest productRequest);

    ProductResponse getById(Long id);
    ProductDeleteResponse delete(Long id);
}
