package Cert12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        var p1 = new Product("name1"); 
        var p2 = new Product("name2");
        
        var set1 = new HashSet<Product>();
        set1.add(p1);
        set1.add(p2);

        List<Product> list1 = new ArrayList<>();
        List<Product> list2 = new ArrayList<>(20);
        List<Product> list3 = new ArrayList<>(set1);

        // Fixed
        List<Product> list4 = Arrays.asList(p2, p2);
        //list4.add(p1);
        // Read Only
        List<Product> list5 = List.of(p1,p2);
        //list5.add(p2);
        System.out.println(list4.toString());

    }
}
