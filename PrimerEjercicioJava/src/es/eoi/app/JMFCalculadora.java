package es.eoi.app;

import java.util.Scanner;

import java.math.*;

public class JMFCalculadora {

	public static void main(String[] args) {
		System.out.println(
			"CALCULADORA\n1-Sumar\n2-Restar\n3-Multiplicar\n4-Dividir\n5-Valor Absoluto\n" + 
			"6-Mostrar PI\nElige una opción:");
		
		Scanner sc = new Scanner(System.in);
		String opcion = sc.nextLine();
		System.out.println("has elegido la opcion " + opcion);
		
		switch(opcion) {
		case "1":
		{
			System.out.println("Introduce el primer número");
			String strnumero1 = sc.nextLine();
			double numero1 = Double.parseDouble(strnumero1);
			System.out.println("Introduce el segundo número");
			String strnumero2 = sc.nextLine();
			double numero2=Double.parseDouble(strnumero2);
			System.out.println(strnumero1+" + " + strnumero2+" = "+ (numero1 + numero2));
			
			break;
		}
		case "2":
		{
			System.out.println("Introduce el primer número");
			String strnumero1 = sc.nextLine();
			double numero1 = Double.parseDouble(strnumero1);
			
			System.out.println("Introduce el segundo número");
			String strnumero2 = sc.nextLine();
			double numero2=Double.parseDouble(strnumero2);
			
			System.out.println(strnumero1+" - " + strnumero2+" = "+ (numero1 - numero2));
			
			
			break;
		}
		case "3":
		{
			System.out.println("Introduce el primer número");
			String strnumero1 = sc.nextLine();
			double numero1 = Double.parseDouble(strnumero1);
			System.out.println("Introduce el segundo número");
			String strnumero2 = sc.nextLine();
			double numero2=Double.parseDouble(strnumero2);
			System.out.println(strnumero1+" * " + strnumero2+" = "+ (numero1 * numero2));
			
			
			break;
		}
		case "4":
		{
			System.out.println("Introduce el primer número");
			String strnumero1 = sc.nextLine();
			double numero1 = Double.parseDouble(strnumero1);
			System.out.println("Introduce el segundo número");
			String strnumero2 = sc.nextLine();
			double numero2=Double.parseDouble(strnumero2);
			System.out.println(strnumero1+" / " + strnumero2+" = "+ (numero1 / numero2));
			
			break;
		}
		case "5":
		{
			System.out.println("Introduce el número");
			String strnumero1 = sc.nextLine();
			double numero1 = Double.parseDouble(strnumero1);
			numero1= Math.abs(numero1);
			
			break;
		}
		case "6":
		{
			System.out.println(Math.PI);
			break;
			
		}
		default:System.out.println("Opcion no reconocida");
		}
		sc.close();
	}

}
