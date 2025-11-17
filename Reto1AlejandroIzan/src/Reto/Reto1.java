package Reto;

import java.util.Locale;
import java.util.Scanner;

public class Reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("---RETO 1 REALIZADO POR IZAN, NABIL Y ALEJANDRO---");
		System.out.println("ELIGE UNA OPCIÓN: ");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Par");
		System.out.println("6. Impar");
		System.out.println("7. Positvo");
		System.out.println("8. Negativo");
		System.out.println("0. Salir");

		String op = sc.nextLine();
		int opcion = Integer.parseInt(op);

		switch (opcion) {
		case 1:
			System.out.println("1. Sumar");
			break;

		case 2:
			System.out.println("1. Restar");
			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:

			break;
		case 7:

			break;
		case 8:

			break;

		default:
			break;
		}

	}

}
