package Funciones;

import java.util.Scanner;

public class FuncionesVectores {
	public static void pedirVector (int v []) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i< v.length; i++) {
			System.out.println("Introduce el elemento " +i + ": ");
			v[i]=teclado.nextInt();
		}
	}
	public static void mostrarVector (int v []) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%d ", v[i]);
		}
	}
	
	public static void mostrarMenoresQue(int v [], int n) {
		for (int i = 0; i< v.length; i++) {
			if (v[i] < n) {
				System.out.printf("%d ",v[i]);
			}
		}
	}
	
	
	public static void comparar(int v [], int a, int b) {
		for (int i = 0; i< v.length; i++) {
			if ((a <= v[i]) && (v[i] < b)) {
				System.out.printf("%d ", v[i]);
			}
		}
	}
	public static void rotarIzq(int v[]) {
		 int aux=v[0];
		for (int i = 0; i< v.length-1; i++) {
			v[i]=v[i+1];}
		v[v.length-1]=aux;
			
			
		}
	public static void rotarDer(int v[]) {
		 int aux=v[v.length-1];
		for (int i = v.length-1; i>0; i--) {
			v[i]=v[i-1];}
		v[0]=aux;
	
	}
	
	public static void mostrarDesde(int vector[], int auxiliar) {
		boolean encontrado=false;
		//int pos=vector.length;
		int i=0;
		for (i = 0; i < vector.length; i++) {
			if(vector[i]==auxiliar) {
				break;
			}
		}
		for (int j=i;j<vector.length;j++) {
			System.out.println(vector[j]+ " ");
		}
	}

	
	public static boolean paralelo (int v1[], int v2[]) {
		boolean paralelo=true;
		double factor=v1[0]/(double)v2[0];
		for(int i=1;i< v1.length && paralelo==true; i++) {
			if (v1[i]/(double)v2[i]!=factor) {
				paralelo=false;
			}
		}
		return paralelo;
	}
	
	public static boolean capicua (int v[]) {
		boolean capicua =true;
		for (int i=0, j=v.length-1; i<j; i++, j--) {
			if (v[i]!=v[j])
					capicua=false;
		}
		return capicua;		
	}
	
	
}


