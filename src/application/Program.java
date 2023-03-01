package application;

import java.util.Scanner;

import entities.Calculos;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o raio: ");
		Double radius = sc.nextDouble();

		System.out.println("Circunferencia: " + String.format("%.2f", Calculos.circumference(radius)) 
		+ "\nVolume: " + String.format("%.2f", Calculos.volume(radius)));
		
		sc.close();
	}
	

}
