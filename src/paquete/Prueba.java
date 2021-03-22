package paquete;

import java.util.Iterator;

public class Prueba {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println("\n"+"La tabla del "+i);
			for (int j = 1; j < 10; j++) {
				System.out.println(i+" x "+j+" = "+(i*j));
			}
		}
	}
}
