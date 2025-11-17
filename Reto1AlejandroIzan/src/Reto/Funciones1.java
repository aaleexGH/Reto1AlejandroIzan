package Reto;

import java.util.Scanner;

public class Funciones1 {

	public static int maximo3(int n1, int n2, int n3)
	{
		return Math.max(n1, Math.max(n2, n3));
	}

	
	public static int minimo3(int n1, int n2, int n3)
	{
			return Math.min(n1, Math.min(n2, n3));
	}
}
