public class Phone {

    private String name;
    private Brand brand;
    private Color color;
    private OperationSystem operationSystem;

    private int price;

    public Phone(String name, Brand brand, Color color, OperationSystem operationSystem, int price) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.operationSystem = operationSystem;
        this.price = price;
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

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", brand=" + brand +
                ", color=" + color +
                ", operationSystem=" + operationSystem +
                ", price=" + price +
                '}';
    }
}
