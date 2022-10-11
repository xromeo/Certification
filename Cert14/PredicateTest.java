package Cert14;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    
    public static void main(String[] args) {
        List<Product> menu = new ArrayList<>();
        menu.add(new Product("Cake", BigDecimal.valueOf(25.2)));
        menu.add(new Product("Tea", BigDecimal.ONE ));
        menu.add(new Product("Chocolate", BigDecimal.valueOf(3)));
        menu.add(new Product("Bread", BigDecimal.TEN));
        Predicate<Product> priceFilter = (p) -> p.getPrice().compareTo(BigDecimal.valueOf(5)) < 0;

        menu.removeIf(priceFilter.negate());
        

        menu.stream().forEach(System.out::println);

    }
}
