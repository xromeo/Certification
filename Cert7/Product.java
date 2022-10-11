package Cert7;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Product {
    private static Period defaultExpiryPeriod ;

    static{
        defaultExpiryPeriod = Period.ofDays(3);
    }

    private final String name;
    private final BigDecimal price;
    private LocalDate bestBefore;
    public static void setDefaultExpiryPeriod(int days){
        defaultExpiryPeriod = Period.ofDays(days);
        //String name = this.name;
    }

    public static Period getDefaultExpiryPeriod(){
        return defaultExpiryPeriod;
    }


    public Product() {
        name = "Tea";
        price = BigDecimal.valueOf(2.5);
        defaultExpiryPeriod = Period.ZERO;
        System.out.println("P0 0: " + Product.getDefaultExpiryPeriod());

    }

    public String getName() {
        return name;
    }
}
