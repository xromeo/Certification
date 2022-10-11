package Cert10;

import java.math.BigDecimal;

public class Product {

    Object x;
    private final String name;
    private final BigDecimal price;
    

    public Product(String name) {
        this.name = name;
        this.price = BigDecimal.ZERO;
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
    public BigDecimal getDiscount(final BigDecimal discount){
        return price.multiply(discount);
    }
}
