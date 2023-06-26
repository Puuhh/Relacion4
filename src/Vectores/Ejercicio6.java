package Vectores;

import java.util.Scanner;

import Funciones.FuncionesVectores;

public class Ejercicio6 {

	public static void main(String[] args) {
		/* Dado un array de enteros de tamaño N, se debe buscar el primer elemento del array 
		mayor que un número A, y a partir de él inclusive, visualizar todos los valores de los 
		siguientes hasta el último elemento del array.
		*/
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe el tamaño del vector");
		int num = teclado.nextInt();
		int vector []= new int [num];
		FuncionesVectores.pedirVector(vector);
		System.out.printf("Tu vector es \n");
		FuncionesVectores.mostrarVector(vector);
		System.out.println("\n Elige un numero a partir del que mostrar");
		int num2=teclado.nextInt();
		FuncionesVectores.mostrarDesde(vector, num2);
		

	}

}
