package Cert17;

import java.nio.file.Path;
import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;

public class Test {
	public Test() {
		System.out.print("Message 1" +", ");
	}
	public Test(String message) {
		System.out.print(message +", ");
		display();
	}
	public void display() {
		System.out.print("Message 2" +", ");
	}
	public void display(Object message) {
		System.out.print("Object" +", ");
	}
	public void display(String message) {
		System.out.print(message +", ");
	}

    public static void main(String[] args) {
        Test test = new Test();
        test.display("Message X");


        Path someFile = Path.of("/","users","joe","docs","some.txt");
        Path justSomeFile = someFile.getFileName();
        System.out.println(justSomeFile);
        Path docsFolder = someFile.getParent();
        System.out.println(docsFolder);
        Path currentFolder = docsFolder.relativize(someFile);
        System.out.println(currentFolder);
    }
}