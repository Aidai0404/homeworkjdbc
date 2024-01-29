package dao.impl;

import classes.Product;
import dao.ProductDao;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    List<Product>products = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public Product getById(int id) {
        Product product1 = new Product();
        for(Product product : products){
            if(product.getId()==id){
                product1=product;
            }
        }
        return product1;
    }

    @Override
    public void discountedPrice() {
        for(Product product : products){
            double discount = (double) product.getDiscount().getPercent()/100;
            double disPrice = product.getPrice()*discount;
            int discountedPrice = (int) (product.getPrice() - disPrice);
            product.setCurrentPrice(discountedPrice);
            System.out.println(product);
        }
    }
}
