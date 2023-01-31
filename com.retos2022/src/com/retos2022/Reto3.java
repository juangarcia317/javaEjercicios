package com.retos2022;
/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

public class Reto3 {
	public static void main(String[] args) {
 		System.out.print("Num primos: 1");
		for (int i=2; i <=100; i++) {
			if (esPrimo(i)) {
				System.out.print (", " + i);
			}
		}
	}

	private static boolean esPrimo(int iNum) {
		boolean bPrimo = true;
		// primo si solo se puede dividir por si mismo y unidad
		int i = 2;
		while (i < iNum / 2 && bPrimo) {
			if (iNum % i == 0) {
				bPrimo = false;
			} else {
				i++;
			}
		}
		return bPrimo;
	}
}
