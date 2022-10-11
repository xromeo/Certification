package Cert11;

import static java.math.RoundingMode.*;

import java.math.BigDecimal;

public abstract class Product implements Rateable<Product> {

    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
    private int id;
    private String name;
    private BigDecimal price;
    private Rating rating;

    public Product(int id, String name, BigDecimal price, Rating rating) {

        this.name = name;
        this.id = id;        
        this.price = price;
        this.rating = rating;

    }

    public BigDecimal getPrice() {
        return price;
    }

    public Rating getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getDiscount(){
    return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
    }


    public abstract Product applyRating(Rating newRating);
    
}