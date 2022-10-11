package Cert13;

import java.util.Comparator;

public class Order {
    public static void createShippingMode(String description){
        new ShippingMode(description);
    }

    private static class ShippingMode implements Comparator{
        private String description;
        public ShippingMode(String description) {
            this.description = description;
        }
        @Override
        public int compare(Object o1, Object o2) {
            // TODO Auto-generated method stub
            return 0;
        }
    }

    public static void main(String[] args) {
        Order.createShippingMode("Fast");
        Order.createShippingMode("Normal");

        Order order1 = new Order();
        Order order2 = new Order();
        
    }
}
