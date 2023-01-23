package com.retos2022;
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
		
	}
	private boolean esAnagrama(String cad1, String cad2) {
		boolean bRes = false;
		if (!cad1.equals(cad2) && (cad1.length() == cad2.length() )) {
			//Si son distintas ya es false y si tienen distinto tamaño false también
			boolean bSonIguales = true;
			int i = cad1.length(); 
			while (bSonIguales && i < cad2.length()) {
				
			}
				
		}
		return bRes;
	}
}
