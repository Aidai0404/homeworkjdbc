package service;

import classes.Product;

public interface ProductService {
      void addProduct(Product product);
      Product getById(int id);
      void discountedPrice();
}
