package Reto;

import java.util.Locale;
import java.util.Scanner;
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
			System.out.println("Dame un numero (n1): ");
			String n1suma = sc.nextLine();
			int numero1suma = Integer.parseInt(n1suma);
			
			System.out.println("Dame un numero (n2): ");
			String n2suma = sc.nextLine();
			int numero2suma = Integer.parseInt(n2suma);
			System.out.println(Funciones2.sumar(numero1suma, numero2suma));
			break;
		case 2:
			System.out.println("2. Restar");
			System.out.println("Dame un numero (n1): ");
			String n1resta = sc.nextLine();
			int numero1resta = Integer.parseInt(n1resta);
			
			System.out.println("Dame un numero (n2): ");
			String n2resta = sc.nextLine();
			int numero2resta = Integer.parseInt(n2resta);
			System.out.println(Funciones2.restar(numero1resta, numero2resta));
			break;
		case 3:
			System.out.println("3. Multiplicar");
			System.out.println("Dame un numero (n1): ");
			String n1multi = sc.nextLine();
			int numero1multi = Integer.parseInt(n1multi);
			
			System.out.println("Dame un numero (n2): ");
			String n2multi = sc.nextLine();
			int numero2multi = Integer.parseInt(n2multi);
			System.out.println(Funciones3.multiplicar(numero1multi, numero2multi));
			break;
		case 4:
			System.out.println("4. Dividir");
			System.out.println("Dame un numero (n1): ");
			String n1divi = sc.nextLine();
			int numero1divi = Integer.parseInt(n1divi);
			
			System.out.println("Dame un numero (n2): ");
			String n2divi = sc.nextLine();
			int numero2divi = Integer.parseInt(n2divi);
			System.out.println(Funciones3.dividir(numero1divi, numero2divi));
			break;
		case 5:
			System.out.println("5. Par");
			System.out.println("Dame un numero (n1): ");
			String n1par = sc.nextLine();
			int numero1par = Integer.parseInt(n1par);
			System.out.println(Funciones2.esPar(numero1par));
			break;
		case 6:
			System.out.println("6. Impar");
			System.out.println("Dame un numero (n1): ");
			String n1impar = sc.nextLine();
			int numero1impar = Integer.parseInt(n1impar);
			System.out.println(Funciones2.esImpar(numero1impar));
			break;
		case 7:
			System.out.println("7. Positivo");
			System.out.println("Dame un numero (n1): ");
			String n1positivo = sc.nextLine();
			int numero1positivo = Integer.parseInt(n1positivo);
			System.out.println(Funciones3.EsPositivo(numero1positivo));
			break;
		case 8:
			System.out.println("8. Negativo");
			System.out.println("Dame un numero (n1): ");
			String n1negativo = sc.nextLine();
			int numero1negativo = Integer.parseInt(n1negativo);
			System.out.println(Funciones3.EsNegativo(numero1negativo));
			break;
		case 9:
			System.out.println("9. Maximo");
			System.out.println("Dame un numero (n1): ");
			String n1maximo = sc.nextLine();
			int numero1maximo = Integer.parseInt(n1maximo);
			
			System.out.println("Dame un numero (n2): ");
			String n2maximo = sc.nextLine();
			int numero2maximo = Integer.parseInt(n2maximo);
			
			System.out.println("Dame un numero (n3): ");
			String n3maximo = sc.nextLine();
			int numero3maximo = Integer.parseInt(n3maximo);
			System.out.println(Funciones1.maximo3(numero1maximo, numero2maximo, numero3maximo));
			break;
		case 10:
			System.out.println("10. Minimo");
			System.out.println("Dame un numero (n1): ");
			String n1minimo = sc.nextLine();
			int numero1minimo = Integer.parseInt(n1minimo);
			
			System.out.println("Dame un numero (n2): ");
			String n2minimo = sc.nextLine();
			int numero2minimo = Integer.parseInt(n2minimo);
			
			System.out.println("Dame un numero (n3): ");
			String n3minimo = sc.nextLine();
			int numero3minimo = Integer.parseInt(n3minimo);
			System.out.println(Funciones1.minimo3(numero1minimo, numero2minimo, numero3minimo));
			break;
		case 0:
			System.out.println("0. Salir");
			break;

		default:
			break;
		}

	}

}
