package Cert7;

import java.math.BigDecimal;

public class Shop {

    private static final int MAX_EXPIRY_PERIOD = 5;
    public static void main(String[] args) {

        System.out.println("P0: " + Product.getDefaultExpiryPeriod());

        Product.setDefaultExpiryPeriod(4);
        System.out.println("P1: " + Product.getDefaultExpiryPeriod());

        Product p1 = new Product();
        Product p2 = new Product();
       
        p1.setDefaultExpiryPeriod(2);

        System.out.println("P2: " + p2.getDefaultExpiryPeriod());

        Product p3 = new Product();
        System.out.println("P3: " + Product.getDefaultExpiryPeriod());

        System.out.println("P2: " + p2.getDefaultExpiryPeriod());

    }
}
