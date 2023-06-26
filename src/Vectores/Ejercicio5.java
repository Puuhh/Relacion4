package Vectores;

import java.util.Scanner;

import Funciones.FuncionesVectores;

public class Ejercicio5 {

	public static void main(String[] args) {
		/* Dado un array de enteros de tamaño N, rotar sus valores una posición a la derecha, es 
		decir, si tenemos un array como el siguiente: 5 -1 -3 15 4, el resultado deberá ser el 
		array rotado a la derecha: 4 5 -1 -3 15.
		*/
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe el tamaño del vector");
		int num = teclado.nextInt();
		int vector []= new int [num];
		FuncionesVectores.pedirVector(vector);
		System.out.printf("Tu vector es \n");
		FuncionesVectores.mostrarVector(vector);
		System.out.printf("\n Tu vector rotado es \n");
		FuncionesVectores.rotarDer(vector);
		FuncionesVectores.mostrarVector(vector);
	}

}
