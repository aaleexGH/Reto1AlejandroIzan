package Reto;

import java.util.Locale;
import java.util.Scanner;
import Reto.Funciones;
import Reto.Funciones1;
import Reto.Funciones2;
import Reto.Funciones3;

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
		System.out.println("9. Maximo");
		System.out.println("10. Minimo");
		System.out.println("0. Salir");

		String op = sc.nextLine();
		int opcion = Integer.parseInt(op);

		switch (opcion) {
		case 1:
			System.out.println("1. Sumar");

			int n1suma = Funciones.dimeEntero("Dame un numero (n1)", sc);
			int n2suma = Funciones.dimeEntero("Dame un numero (n2)", sc);

			System.out.println(Funciones2.sumar(n1suma, n2suma));
			break;
		case 2:
			System.out.println("2. Restar");

			int n1resta = Funciones.dimeEntero("Dame un numero (n1)", sc);
			int n2resta = Funciones.dimeEntero("Dame un numero (n2)", sc);

			System.out.println(Funciones2.restar(n1resta, n2resta));
			break;
		case 3:
			System.out.println("3. Multiplicar");

			int n1multi = Funciones.dimeEntero("Dame un numero (n1)", sc);
			int n2multi = Funciones.dimeEntero("Dame un numero (n2)", sc);

			System.out.println(Funciones3.multiplicar(n1multi, n2multi));
			break;
		case 4:
			System.out.println("4. Dividir");

			int n1divi = Funciones.dimeEntero("Dame un numero (n1)", sc);
			int n2divi = Funciones.dimeEntero("Dame un numero (n2)", sc);

			System.out.println(Funciones3.dividir(n1divi, n2divi));
			break;
		case 5:
			System.out.println("5. Par");
			int n1par = Funciones.dimeEntero("Dame un numero (n1)", sc);
			System.out.println(Funciones2.esPar(n1par));
			break;
		case 6:
			System.out.println("6. Impar");
			int n1impar = Funciones.dimeEntero("Dame un numero (n1)", sc);
			System.out.println(Funciones2.esImpar(n1impar));
			break;
		case 7:
			System.out.println("7. Positivo");
			int n1positivo = Funciones.dimeEntero("Dame un numero (n1)", sc);
			System.out.println(Funciones3.EsPositivo(n1positivo));
			break;
		case 8:
			System.out.println("8. Negativo");
			int n1negativo = Funciones.dimeEntero("Dame un numero (n1)", sc);
			System.out.println(Funciones3.EsNegativo(n1negativo));
			break;
		case 9:
			System.out.println("9. Maximo");
			int n1maximo = Funciones.dimeEntero("Dame un numero (n1)", sc);

			int n2maximo = Funciones.dimeEntero("Dame un numero (n2)", sc);

			int n3maximo = Funciones.dimeEntero("Dame un numero (n3)", sc);
			System.out.println(Funciones1.maximo3(n1maximo, n2maximo, n3maximo));
			break;
		case 10:
			System.out.println("10. Minimo");
			int n1minimo = Funciones.dimeEntero("Dame un numero (n1)", sc);
			int n2minimo = Funciones.dimeEntero("Dame un numero (n2)", sc);
			int n3minimo = Funciones.dimeEntero("Dame un numero (n3)", sc);

			System.out.println(Funciones1.minimo3(n1minimo, n2minimo, n3minimo));
			break;
		case 0:
			System.out.println("Saliendo...");
			break;

		default:
			break;
		}

	}

}
