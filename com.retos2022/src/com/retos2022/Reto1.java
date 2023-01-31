package com.retos2022;

import java.util.Arrays;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

public class Reto1 {

	public static void main(String[] args) {
		boolean bAnagrama = esAnagrama("Enrique", "quieren");
		System.out.println("anagrama: " + bAnagrama);

	}

	private static boolean esAnagrama(String cad1, String cad2) {

		char[] stringtoChar1 = cad1.toCharArray();
		Arrays.sort(stringtoChar1);
		String sortedString1 = new String(stringtoChar1);
		System.out.println("sortedString1:" + sortedString1);
		char[] stringtoChar2 = cad2.toCharArray();
		Arrays.sort(stringtoChar2);
		String sortedString2 = new String(stringtoChar2);
		System.out.println("sortedString2:" + sortedString2);
		return sortedString2.equalsIgnoreCase(sortedString1);

	}
}
