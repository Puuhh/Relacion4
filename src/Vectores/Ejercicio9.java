package Vectores;

import java.util.Scanner;

import Funciones.FuncionesVectores;

public class Ejercicio9 {

	public static void main(String[] args) {
		/* Dado un array de enteros de tamaño N, copiarlo a otro array de igual tamaño pero de 
		forma inversa, es decir, si por ejemplo el array de entrada es: 5 -1 -3 15 4, el resultado 
		debe ser un nuevo array cuyos valores son: 4 15 -3 -1 5.
		*/
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe el tamaño del vector");
		int num = teclado.nextInt();
		int vector []= new int [num];
		FuncionesVectores.pedirVector(vector);
		System.out.println("Tu vector es \n");
		FuncionesVectores.mostrarVector(vector);
	}

}
