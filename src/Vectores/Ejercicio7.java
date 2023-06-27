package Vectores;

import java.util.Scanner;

import Funciones.FuncionesVectores;

public class Ejercicio7 {

	public static void main(String[] args) {
		/* Dados dos arrays de reales de tamaño N, suponiendo que modelan dos vectores de un 
		espacio N-dimensional, decir si son paralelos o no. Son paralelos si todos sus valores 
		son proporcionales
		*/
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe el tamaño del vector 1");
		int num1 = teclado.nextInt();
		int vector1 []= new int [num1];
		FuncionesVectores.pedirVector(vector1);
		FuncionesVectores.mostrarVector(vector1);
		System.out.println("\nEscribre el vector 2");
		int vector2 []= new int [num1];
		FuncionesVectores.pedirVector(vector2);
		FuncionesVectores.mostrarVector(vector2);
		FuncionesVectores.paralelo(vector1, vector2);
		if (FuncionesVectores.paralelo(vector1, vector2)){
			System.out.println("Los vectores son paralelos");
		} else System.out.println("\nLos vectores no son paralelos");
		
	}
		
	}


