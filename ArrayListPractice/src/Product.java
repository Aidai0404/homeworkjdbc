public class Product {
    private String name;
    private Discount discount;
    private int price;

    private int currentPrice;

    public Product(String name, Discount discount, int price) {
        this.name = name;
        this.discount = discount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
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

    public void discountedPrice(){
        double discount = (double) getDiscount().getPercent()/100;
        double disPrice = getPrice()*discount;
        int discountedPrice = (int) (getPrice() - disPrice);
        setCurrentPrice(discountedPrice);
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", discount " + discount +
                ", price=" + price +
                ", currentPrice=" + currentPrice +
                '}';
    }
}
