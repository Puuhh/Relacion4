package Vectores;

import java.util.Scanner;

import Funciones.FuncionesVectores;

public class Ejercicio4 {

	public static void main(String[] args) {
		/* Dado un array de enteros de tamaño N, rotar sus valores una posición a la izquierda, es 
		decir, si tenemos un array como el siguiente: 5 -1 -3 15 4, el resultado deberá ser el 
		array rotado a la izquierda: -1 -3 15 4 5. 
		*/
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe el tamaño del vector");
		int num = teclado.nextInt();
		int vector []= new int [num];
		FuncionesVectores.pedirVector(vector);
		FuncionesVectores.rotarIzq(vector);
		System.out.printf("el vector rotado es \n");
		FuncionesVectores.mostrarVector(vector);
		
	}

}
