package util;

public class Calculator {
	
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) { //Não se esqueça que sem o static você não conseguiria usar esse metodo, pois um metodo static so pode ser usado em outro static
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
