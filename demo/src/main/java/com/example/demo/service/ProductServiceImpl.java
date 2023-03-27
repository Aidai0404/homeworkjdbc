package com.example.demo.service;

import com.example.demo.dto.ProductDeleteResponse;
import com.example.demo.dto.ProductAddRequest;
import com.example.demo.dto.ProductResponse;
import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    @Override
    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductResponse>productsList = new ArrayList<>();
        for (Product product: products){
           productsList.add(mapToResponse(product));
        }
        return productsList;
    }

    @Override
    public ProductResponse save(ProductAddRequest productRequest) {
        Product product = mapToEntity(productRequest);
        productRepository.save(product);
        return mapToResponse(product);
    }

    @Override
    public ProductResponse update(Long id, ProductAddRequest productRequest) {
        Product product = productRepository.findById(id).get();
        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());
        product.setBrand(productRequest.getBrand());
        product.setColor(productRequest.getColor());
        product.setDateOfIssue(productRequest.getDateOfIssue());
        product.setOs(productRequest.getOs());
        product.setRam(productRequest.getRam());
        product.setRom(productRequest.getRom());
        product.setSim(productRequest.getSim());
        product.setCpu(productRequest.getCpu());
        product.setWeight(productRequest.getWeight());
        product.setGuarantee(productRequest.getGuarantee());
        product.setImage(productRequest.getImage());
        product.setDisplayInch(productRequest.getDisplayInch());
        product.setAppointment(productRequest.getAppointment());
        product.setCapacityBattery(productRequest.getCapacityBattery());
        if(productRequest.getCategoryId()!=null){
            Category category = categoryRepository.findById(productRequest.getCategoryId()).get();
            product.setCategory(category);
        }
        productRepository.saveAndFlush(product);
        return mapToResponse(product);
    }

    @Override
    public ProductResponse getById(Long id) {
        Product product = productRepository.findById(id).get();
        return mapToResponse(product);
    }

    @Override
    public ProductDeleteResponse delete(Long id) {
        ProductDeleteResponse productDeleteResponse = new ProductDeleteResponse();
      Product product = productRepository.findById(id).get();
      if(product != null){
          productRepository.delete(product);
          productDeleteResponse.setHttpStatus(HttpStatus.OK);
      }else{
          productDeleteResponse.setHttpStatus(HttpStatus.NOT_FOUND);
      }
      return productDeleteResponse;
    }

    public Product mapToEntity(ProductAddRequest productRequest){
        Product product = new Product();
        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());
        product.setBrand(productRequest.getBrand());
        product.setColor(productRequest.getColor());
        product.setDateOfIssue(productRequest.getDateOfIssue());
        product.setOs(productRequest.getOs());
        product.setRam(productRequest.getRam());
        product.setRom(productRequest.getRom());
        product.setSim(productRequest.getSim());
        product.setCpu(productRequest.getCpu());
        product.setWeight(productRequest.getWeight());
        product.setGuarantee(productRequest.getGuarantee());
        product.setImage(productRequest.getImage());
        product.setDisplayInch(productRequest.getDisplayInch());
        product.setAppointment(productRequest.getAppointment());
        product.setCapacityBattery(productRequest.getCapacityBattery());
        if(productRequest.getCategoryId()!=null){
            Category category = categoryRepository.findById(productRequest.getCategoryId()).get();
            product.setCategory(category);
        }
        return product;
    }
    public ProductResponse mapToResponse(Product product){
        ProductResponse productResponse = new ProductResponse();
        productResponse.setId(product.getId());
        productResponse.setName(product.getName());
        productResponse.setColor(product.getColor());
        productResponse.setDateOfIssue(product.getDateOfIssue());
        productResponse.setOs(product.getOs());
        productResponse.setRam(product.getRam());
        productResponse.setRom(product.getRom());
        productResponse.setSim(product.getSim());
        productResponse.setCpu(product.getCpu());
        productResponse.setWeight(product.getWeight());
        productResponse.setGuarantee(product.getGuarantee());
        productResponse.setImage(product.getImage());
        productResponse.setDisplayInch(product.getDisplayInch());
        productResponse.setAppointment(product.getAppointment());
        productResponse.setCapacityBattery(product.getCapacityBattery());
        return productResponse;
    }
}
