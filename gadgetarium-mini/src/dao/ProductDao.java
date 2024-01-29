package dao;

import classes.Product;

public interface ProductDao {
    void addProduct(Product product);

    Product getById(int id);
    void discountedPrice();
}
