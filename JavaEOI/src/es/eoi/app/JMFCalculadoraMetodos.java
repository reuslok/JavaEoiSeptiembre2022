package es.eoi.app;

import java.util.Scanner;

public class JMFCalculadoraMetodos {
	static Scanner sc = new Scanner(System.in);
	static double numero1 =0;
	static double numero2 =0;
	static String strnumero1;
	static String strnumero2;
	public static void twoNumberOp() {
		System.out.println("Introduce el primer número");
		strnumero1 = sc.nextLine();
		numero1 = Double.parseDouble(strnumero1);
		System.out.println("Introduce el segundo número");
		strnumero2 = sc.nextLine();
		numero2=Double.parseDouble(strnumero2);
	}
	
	public static void main(String[] args) {
		
			System.out.println(
				"CALCULADORA\n1-Sumar\n2-Restar\n3-Multiplicar\n4-Dividir\n5-Valor Absoluto\n" + 
				"6-Mostrar PI\nElige una opción:");
			

			String opcion = sc.nextLine();
			System.out.println("has elegido la opcion " + opcion);
			
			
			switch(opcion) {
			case "1":
			{
				twoNumberOp();
				System.out.println(strnumero1+" + " + strnumero2+" = "+ (numero1 + numero2));
				
				break;
			}
			case "2":
			{
				twoNumberOp() ;
				System.out.println(strnumero1+" - " + strnumero2+" = "+ (numero1 - numero2));
				
				
				break;
			}
			case "3":
			{
				twoNumberOp() ;
				System.out.println(strnumero1+" * " + strnumero2+" = "+ (numero1 * numero2));
				
				
				break;
			}
			case "4":
			{
				twoNumberOp() ;
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
