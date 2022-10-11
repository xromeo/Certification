package Cert15;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTestCollector {
    public static void main(String[] args) {
        System.out.println(IntStream.generate(()-> (int)(Math.random()*10)).takeWhile(n -> n!=5).sum());
        Stream.of(new Product("P1"), new Product("P2")).forEach(p->System.out.println(p.getName()));
        List<Product> list = new ArrayList<>();
        Product[] array = {new Product("A"), new Product("B")};
        System.out.println(list.stream().parallel().mapToDouble(p->p.getPrice().floatValue()).sum());
        Arrays.stream(array).filter(p->p.getPrice().intValue() == 0).forEach(p->System.out.println(p.getName()));
        list.stream().filter(p-> p.getName().equals("p1")).peek(p->p.getName()).map(p->p.getName())
        .forEach(p->System.out.println(p));

        List<Product> lista = Arrays.asList(new Product("P1", Rate.HIGH), new Product("P3"), new Product("P3", BigDecimal.valueOf(3)));
        Stream<List<Product>> slp = Stream.of(lista);
        Map<Product, Set<Rate>> pr = slp.collect(Collectors.groupingBy(p-> p.get(0)));

    }
}
