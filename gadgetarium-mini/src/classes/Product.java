package classes;

import enums.Brand;
import enums.Color;
import enums.OperationSystem;

public class Product {
    private int id;
    private String name;
    private Brand brand;
    private Color color;
    private OperationSystem operationSystem;
    private int price;
    private int currentPrice;
    private Discount discount;

    public Product(int id,String name, Brand brand, Color color, OperationSystem operationSystem, int price,Discount discount) {
        this.id=id;
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.operationSystem = operationSystem;
        this.price = price;
        this.discount=discount;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public OperationSystem getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(OperationSystem operationSystem) {
        this.operationSystem = operationSystem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand=" + brand +
                ", color=" + color +
                ", operationSystem=" + operationSystem +
                ", price=" + price +
                ", currentPrice=" + currentPrice +
                '}';
    }
}
