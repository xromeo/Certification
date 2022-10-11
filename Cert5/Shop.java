package Cert5;

import java.math.BigDecimal;

public class Shop {
    public static void main(String[] args) {
        Product p = new Product();
        BigDecimal percentage = BigDecimal.valueOf(0.2);
        final BigDecimal amount = p.getDiscount(percentage);
        System.out.println("Amount:" + amount);
    }
}
