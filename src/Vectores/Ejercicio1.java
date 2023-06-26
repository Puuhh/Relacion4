package Vectores;

import java.util.Scanner;

import Funciones.FuncionesVectores;

//Rellenar un array de tamaño N con valores enteros dados por el usuario a través del 

//teclado. 

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos elementos quieres?");
		int num = teclado.nextInt();
		
		int vector [] = new int [num];
		System.out.println("Introduce los datos");
		FuncionesVectores.pedirVector(vector);
		
		System.out.println("Tu  vector es ");
		FuncionesVectores.mostrarVector(vector);
		
		
	}
}
