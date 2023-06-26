package Vectores;

import java.util.Scanner;

import Funciones.FuncionesVectores;

//Dado un array de enteros de tamaño N, visualizar por pantalla todos los elementos del 
//mismo cuyo valor sea menor que un número A. 
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos elementos quieres?");
		int num = teclado.nextInt();
		int vector [] = new int[num];
		int max;
		System.out.println("Introduce vector");
		FuncionesVectores.pedirVector(vector);
		System.out.println("Tu vector es \n");
		FuncionesVectores.mostrarVector(vector);
		System.out.println(" \n Que numero quieres comprobar?");
		max = teclado.nextInt();
		System.out.println("Tus numeros son");
		FuncionesVectores.mostrarMenoresQue(vector, max);
		
		
		
	}

}
