package entities;

public class Calculos {
	private static final Double PI = 3.14;
	
	public static Double circumference(Double radius) {
		return 2.0 * PI * radius;
	}
	
	public static Double volume(Double radius) {
		return (4.0/3.0) * PI * Math.pow(radius, 3);
	}
}
