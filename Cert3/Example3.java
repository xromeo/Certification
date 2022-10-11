package Cert3;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;

public class Example3 {
    public static void main(String[] args) {
        DoubleFunction<Double> d = r -> Math.PI * r * r;
        BiFunction<Integer, Integer, Integer> divide = (x, y) -> x/y; 
        //DoublePredicate<Integer, Integer> t = (x, y) -> x == y;
        IntPredicate test = x -> x == 10;

    }
}
