package Cert15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest {
    public static void main(String[] args) {
        System.out.println(IntStream.generate(()-> (int)(Math.random()*10)).takeWhile(n -> n!=5).sum());
        Stream.of(new Product("P1"), new Product("P2")).forEach(p->System.out.println(p.getName()));
        List<Product> list = new ArrayList<>();
        Product[] array = {new Product("A"), new Product("B")};
        System.out.println(list.stream().parallel().mapToDouble(p->p.getPrice().floatValue()).sum());
        Arrays.stream(array).filter(p->p.getPrice().intValue() == 0).forEach(p->System.out.println(p.getName()));
        list.stream().filter(p-> p.getName().equals("p1")).peek(p->p.getName()).map(p->p.getName())
        .forEach(p->System.out.println(p));

        Supplier<String> textGenerator = () -> {
            Random random = new Random();
            StringBuilder txt = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                txt.append((char)(random.nextInt(26) + 'a'));
            }
            return txt.toString(); 
        };

        System.out.format(" Result: %s \n",textGenerator.get());

        Consumer<String> textPrinter = s -> System.out.println(s);
        
        UnaryOperator<String> textConverter = s -> s.toUpperCase();
        Stream.generate(textGenerator).limit(10).map(textConverter).forEach(textPrinter);
    }
}
