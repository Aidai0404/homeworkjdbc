import java.util.Arrays;

public class Shop {
    private String name;
    private Phone[]phones;

    public Shop(String name, Phone[] phones) {
        this.name = name;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone[] getPhones() {
        return phones;
    }

    public void setPhones(Phone[] phones) {
        this.phones = phones;
    }


    public int quantityOfProducts(){
        return phones.length;
    }

    public int maxPrice(){
        int max = 0;
        for (Phone phone : this.phones) {
           max =  Math.max(phone.getPrice(),0);
        }
        return max;
    }

    public int arif(){
        int arifPrice = 0;
        for(Phone phone : phones){
            arifPrice+=phone.getPrice();
        }
        return arifPrice;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", phones=" + Arrays.toString(phones) +
                '}';
    }
}


