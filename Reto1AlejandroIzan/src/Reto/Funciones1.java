package Reto;

import java.util.Scanner;

public class Funciones1 {

	public static int maximo3(int n1)
	{
		do
		{
		try {
			return Math.max(-100000, n1);

		} catch (Exception e) {
			System.out.println("Formato incorrecto. No es un número");
		}
		}while(true);
	}
	
	public static int minimo3(int n1)
	{
		do
		{
		try {
			return Math.min(100000, n1);

		} catch (Exception e) {
			System.out.println("Formato incorrecto. No es un número");
		}
		}while(true);
	}
}
