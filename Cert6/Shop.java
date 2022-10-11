package Cert6;

import java.math.BigDecimal;

public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
       
        System.out.println("P1: " + p1.getName());
        System.out.println("P2: " + p2.getName());

        p1.setDefaultExpiryPeriod(5);

        System.out.println("P1: " + p1.getDefaultExpiryPeriod());
        System.out.println("P2: " + Product.getDefaultExpiryPeriod());

    }
}
