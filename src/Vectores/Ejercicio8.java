package Vectores;

import java.util.Scanner;

import Funciones.FuncionesVectores;

public class Ejercicio8 {

	public static void main(String[] args) {
		/* Dado un array de enteros de tamaño N, decir si es capicúa o no, es decir, si por 
		ejemplo el array es: 5 2 1 2 5, el resultado debe ser “verdad”(se debe tener en cuenta 
				que el tamaño el array puede ser par o impar)
		*/
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe el tamaño del vector");
		int num = teclado.nextInt();
		int vector []= new int [num];
		FuncionesVectores.pedirVector(vector);
		System.out.println("Tu vector es \n");
		FuncionesVectores.mostrarVector(vector);
		if(FuncionesVectores.capicua(vector)) {
			System.out.println("\nEs capicua");}
			else System.out.println("\nNo es capicua");
		}
	}
	
