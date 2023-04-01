package com.example.demo.service;



import com.example.demo.dto.ProductRequest;
import com.example.demo.dto.ProductResponse;
import com.example.demo.dto.SimpleResponse;

import java.util.List;

public interface ProductService {
    List<ProductResponse> getAllProducts();

    ProductResponse save(ProductRequest productRequest);

    ProductResponse savePriceAndQuantity(Long id, ProductRequest productRequest);

    ProductResponse saveDescription(Long id, ProductRequest productRequest);

    ProductResponse update(Long id, ProductRequest productRequest);

    ProductResponse getById(Long id);

    SimpleResponse delete(Long id);


}
