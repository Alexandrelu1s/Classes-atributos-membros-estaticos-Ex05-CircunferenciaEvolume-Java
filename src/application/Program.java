package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final Double PI = 3.14;
		
		System.out.print("Digite o raio: ");
		Double radius = sc.nextDouble();
		
		System.out.println("Circunferencia = " + String.format("%.2f", circunferencia(radius, PI)));
		System.out.println("Volume = " + String.format("%.2f", volume(PI, radius)));
		
		sc.close();
	}
	
	public static Double circunferencia(Double radius, Double PI) {
		return 2 * PI * radius;
	}
	
	public static Double volume(Double PI, Double radius) {
		return (4.0/3.0) * PI * Math.pow(radius, 3);
	}

}
