package Cert5;

import java.math.BigDecimal;

public class Product {
    private final String name = "Tea";
    private final BigDecimal price = BigDecimal.ZERO;
    public BigDecimal getDiscount(final BigDecimal discount){
        return price.multiply(discount);
    }

    public Product() {
        System.out.println("Name: " + this.name);
    } 

    public Product(String name) {
        System.out.println("Name: " + name);
    }
}
