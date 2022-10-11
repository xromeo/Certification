package Cert11;

import java.math.BigDecimal;
import java.time.LocalTime;

public class Drink extends Product{
    public Drink(int id, String name, BigDecimal price, Rating rating) {
        super(id, name, price, rating);
    }

    public BigDecimal getDiscount() {
        LocalTime now = LocalTime.now();
        return (now.isAfter(LocalTime.of(17, 30,0)))
                && now.isBefore(LocalTime.of(18, 30)) ? super.getDiscount() : BigDecimal.ZERO;
        
    }

    
    
    public Product applyRating(Rating newRating){
        return new Drink(getId(), getName(), getPrice(), newRating);
    }
}
