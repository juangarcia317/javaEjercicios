package com.retos2022;
/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

public class Reto4 {
	
	interface Poligono {
		public double areaPoligono ();
		public void printArea();
	}

	class Rectangulo implements Poligono {

		private double lado1, lado2;

		public Rectangulo(int paramL1, int paramL2) { 
			this.lado1=paramL1;
			this.lado2=paramL2;
		}


		@Override
		public double areaPoligono() {
			 return lado1*lado2;
		}

		@Override
		public void printArea() {
			System.out.println("El área de un Rectangulo es: "+areaPoligono());
			
		}

	}
	class Cuadrado implements Poligono {

		private double lado;

		public Cuadrado(int paramLado) {
			this.lado=paramLado;
		}

		@Override
		public double areaPoligono() {
			
			return lado*lado;
		}

		@Override
		public void printArea() {
			System.out.println("El área de un cuadrado es: "+areaPoligono());
			
		}

	}
	
	class Triangulo implements Poligono {

		private int base;
		private int altura;	
		 
		
		public Triangulo(int base, int altura) {
			super();
			this.base = base;
			this.altura = altura;
		}

		@Override
		public double areaPoligono() {
			 
			return (base*altura)/2;
		}

		@Override
		public void printArea() {
			System.out.println("El área de un triángulo es:"+areaPoligono());
			
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Inicio main ");
		Reto4 reto = new Reto4();
		Reto4.Triangulo tri = reto.new Triangulo(3,6);
		area(tri); 
		
		Reto4.Cuadrado cuad= reto.new Cuadrado(4);
		area(cuad);
		
		Reto4.Rectangulo rect = reto.new Rectangulo(12,6);
		area(rect);
		

		
	}
	
	private static double area(Poligono polig) {
		polig.printArea();
	    return polig.areaPoligono();
	}
	 
}
