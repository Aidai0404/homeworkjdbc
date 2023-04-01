package com.example.demo.service;



import com.example.demo.dto.DiscountRequest;
import com.example.demo.dto.DiscountResponse;
import com.example.demo.dto.ProductResponse;
import com.example.demo.dto.SimpleResponse;

import java.util.List;

public interface DiscountService {
    List<DiscountResponse> getAllDiscounts();

    DiscountResponse save(DiscountRequest discountRequest);

    DiscountResponse update(Long id, DiscountRequest discountRequest);

    DiscountResponse getById(Long id);

    SimpleResponse delete(Long id);

    List<ProductResponse> getProductsByDiscountId(Long id, int page, int size);

}
