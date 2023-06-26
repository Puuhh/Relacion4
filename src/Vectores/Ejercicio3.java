package Vectores;

import java.util.Scanner;

import Funciones.FuncionesVectores;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Dado un array de reales del tamaño N, visualizar por pantalla todos los elementos del 
		//mismo cuyo valor pertenezca al intervalo [a,b).
		Scanner teclado = new Scanner(System.in);
	System.out.println("Escribe un numero");
	int num1=teclado.nextInt();
	System.out.println("Escribe otro numero");
	int num2=teclado.nextInt();
	System.out.println("Introduce el tamaño del vector");
	int num3=teclado.nextInt();
	int vector[]=new int [num3];
	FuncionesVectores.pedirVector(vector);
	System.out.printf("Los numeros que estan entre %d y %d son \n ", num1, num2);
	FuncionesVectores.comparar(vector, num1, num2);
	}

}
 