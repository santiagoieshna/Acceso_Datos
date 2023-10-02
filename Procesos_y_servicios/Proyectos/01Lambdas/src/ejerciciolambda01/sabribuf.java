package ejerciciolambda01;

import java.util.Scanner;

public class sabribuf {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un numero: ");
		a = entrada.nextInt();
		System.out.println("Introduce otro numero: ");
		b = entrada.nextInt();

		if (estanEnRango(a, b) && esPar_impar(a, b)) {

				System.out.println("Correcto");

		} else {

			System.out.println("Incorrecto");

		}

	}

	private static boolean estanEnRango(int a, int b) {

		
		if ((a >= 6 && a <= 10) && (b >= 6 && b <= 10)) {

			return true;

		} else {

			return false;

		}

	}

	public static boolean esPar_impar(int a, int b) {

		boolean respuesta = false;
		
		if (a % 2 == 0 && b % 2 == 0) {

			respuesta = true;

		} else if (a % 2 != 0 && b % 2 != 0) {

			respuesta = true;

		} 
		
		return respuesta;
	}

}
