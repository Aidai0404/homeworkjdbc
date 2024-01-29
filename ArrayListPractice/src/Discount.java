import java.util.List;

public class Discount {
    private int percent;
    private List<Product>products;

    public Discount(int percent, List<Product> products) {
        this.percent = percent;
        this.products = products;
    }

    public Discount() {
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void discountedPrice(){
        for(Product product : products){
            double discount = (double) percent/100;
            double disPrice = product.getPrice()*discount;
            int discountedPrice = (int) (product.getPrice() - disPrice);
            product.setCurrentPrice(discountedPrice);
            System.out.println(product);
        }
    }

    @Override
    public String toString() {
        return "percent: " + percent;
    }
}
