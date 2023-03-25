package products;

import java.util.List;

public interface DiscountShowcase {
    void placeInTheDiscountShowcase(List<? extends Products>products);
}
