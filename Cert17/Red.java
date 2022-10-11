package Cert17;
public interface Red extends Black {
	default void getColor(){
		System.out.print("Red");
	}
}