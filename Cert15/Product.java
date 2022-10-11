package Cert15;

import java.math.BigDecimal;

public class Product {
   
    private final String name;
    private final BigDecimal price;
    private Rate rate = Rate.NORMAL;

    public Product(String name, Rate rate) {
        this.name = name;
        this.price = BigDecimal.ZERO;
        this.rate = rate;
    }

    public Product(String name) {
        this.name = name;
        this.price = BigDecimal.ZERO;        
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
        this.rate = Rate.HIGH;
    }
    public BigDecimal getDiscount(final BigDecimal discount){
        return price.multiply(discount);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
