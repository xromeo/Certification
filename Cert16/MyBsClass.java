package Cert16;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyBsClass {
	public static void main(String[] args) {



        double x = 2 * Math.PI * 3l;
        System.out.println("x:" + x);

		byte[] b = new byte[256];
		try (FileInputStream fis = new FileInputStream(args[0]); 
				FileOutputStream fos = new FileOutputStream(args[1])) {
			int count = 0;
			int read = 0;
			while ((read = fis.read(b)) != -1) {
				fos.write(b);
				count += read;
			}
			System.out.println("Output: " + count);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
