package service.impl;

import classes.Product;
import dao.ProductDao;
import dao.impl.ProductDaoImpl;
import service.ProductService;

public class ProductServiceImpl implements ProductService {
    ProductDao productDao = new ProductDaoImpl();

    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Override
    public Product getById(int id) {
        return productDao.getById(id);
    }

    @Override
    public void discountedPrice() {
        productDao.discountedPrice();
    }
}
