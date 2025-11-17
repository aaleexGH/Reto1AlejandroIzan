package Reto;

import java.util.Locale;
import java.util.Scanner;
import Reto.Funciones1;
public class Reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Dame un numero (n1): ");
		String n1 = sc.nextLine();
		int numero1 = Integer.parseInt(n1);
		
		System.out.println("Dame un numero (n2): ");
		String n2 = sc.nextLine();
		int numero2 = Integer.parseInt(n2);
		
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
		System.out.println("9. Maximo");
		System.out.println("10. Minimo");
		System.out.println("0. Salir");

		String op = sc.nextLine();
		int opcion = Integer.parseInt(op);

		switch (opcion) {
		case 1:
			System.out.println("1. Sumar");
			
			break;
		case 2:
			System.out.println("2. Restar");
			break;
		case 3:
			System.out.println("3. Multiplicar");
			break;
		case 4:
			System.out.println("4. Dividir");
			break;
		case 5:
			System.out.println("5. Par");
			break;
		case 6:
			System.out.println("6. Impar");
			break;
		case 7:
			System.out.println("7. Positivo");
			break;
		case 8:
			System.out.println("8. Negativo");
			break;
		case 9:
			System.out.println("9. Maximo");
			System.out.println(Funciones1.maximo3(6,4,2));
			break;
		case 10:
			System.out.println("10. Minimo");
			break;
		case 0:
			System.out.println("0. Salir");
			break;

		default:
			break;
		}

	}

}
