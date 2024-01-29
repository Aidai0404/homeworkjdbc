import classes.Discount;
import classes.Product;
import dao.ProductDao;
import enums.Brand;
import enums.Color;
import enums.OperationSystem;
import service.ProductService;
import service.impl.ProductServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    //    List<Product> productList = new ArrayList<>();
        Discount discount = new Discount();
        discount.setPercent(10);
        ProductService productService = new ProductServiceImpl();
        productService.addProduct(new Product(1,"SmartPhone", Brand.SAMSUNG, Color.WHITE, OperationSystem.ANDROID,25000,discount));
        productService.addProduct(new Product(2,"SmartPhone2",Brand.XIAOMI,Color.GOLD,OperationSystem.ANDROID,23000, discount));
     //   System.out.println(productService.getById(2));
        productService.discountedPrice();
    }
}