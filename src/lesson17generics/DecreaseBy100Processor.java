package lesson17generics;

import java.util.function.Consumer;

public class DecreaseBy100Processor implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() < 100
                ? product.getPrice()
                : product.getPrice() - 100);
    }
}
