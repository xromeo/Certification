package Cert17;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

interface InterfaceOne {
	int field = 99;
	default void method() {
		System.out.print(field);
	}
}
interface InterfaceTwo {
	int field = 1983;
	private void method() {
		System.out.print(field);
	}
}
public class TheConcrete implements InterfaceOne, InterfaceTwo {
	public static void main(String[] args) {

        //Consumer<String> con1 = final String x -> System.out.print(x);

        BiConsumer<String, String> biCon1 = (final var x, final var y) -> System.out.println(x+y);
        
        BiConsumer<String, String> biCon3 = (final var x, var y) -> System.out.println(x+y);
        
        //Consumer<String> con3 = final x -> System.out.print(x);
        
        //Consumer<String> con2 = final var x -> System.out.print(x);
        
        //BiConsumer<String, String> biCon2 = (final var x, y) -> System.out.println(x+y);

        //*** */
        //List<String> list = ...;
        //list.forEach( x -> { System.out.println(x); } );
        //*** */

        var list1 = new ArrayList<>();
        list1.add("Otto");
        var char1 = list1.get(0).charAt(0);
        
        var name = "Gertrud";
        var char3 = name.charAt(0);
        
        //var double = 10.0f;
        
        var list2 = new ArrayList<String>();
        list2.add("Hans");
        var char2 = list2.get(0).charAt(0);
        
        var var = 10;

		TheConcrete theInstance = new TheConcrete();
		theInstance.method();
	}
}