package com.retos2022;
/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */


public class Reto2 {

	public static void main(String[] args) {
		int num1=0, num2=1, num3=0;
		System.out.print("0,1");
		for(int i = 2; i < 50; i++) {
			num3=num1+num2;
			System.out.print(","+num3);
			num1=num2;
			num2=num3;
		}
	}
	 
	
}
