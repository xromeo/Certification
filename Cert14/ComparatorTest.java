package Cert14;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {
        List<Product> menu = new ArrayList<>();
        menu.add(new Product("Cake", BigDecimal.valueOf(25.2)));
        menu.add(new Product("Tea", BigDecimal.ONE ));
        menu.add(new Product("Chocolate", BigDecimal.valueOf(3)));
        menu.add(new Product("Bread", BigDecimal.TEN));
        Comparator<Product> sortNames = (p1, p2) -> p1.getName().compareTo(p2.getName());
        Comparator<Product> sortPrices = (p1, p2) -> p1.getPrice().compareTo(p2.getPrice());

        Collections.sort(menu, sortNames.thenComparing(sortPrices).reversed());
        menu.add(null);
        Collections.sort(menu, Comparator.nullsFirst(sortNames));

        menu.stream().forEach(System.out::println);

    }
    
}
