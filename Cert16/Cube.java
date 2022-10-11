package Cert16;

public class Cube extends Square {
	
    /*
	public double findSurfaceArea() {
		return super.findSurfaceArea() * 6;
	}
    */

    public int calcArea(int x) {
		return super.calcArea(x * 6);
	}

    public static void main(String[] args) {
        Cube shape = (Cube)new Square();
        Square s  = new  Cube();
        System.out.println(shape.calcArea(1));
    }
}