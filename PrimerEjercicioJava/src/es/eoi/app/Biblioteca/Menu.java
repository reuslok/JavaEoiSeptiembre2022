package es.eoi.app.Biblioteca;

import java.util.Scanner;

public class Menu {
public static void printMenuPrincipal() {
		
		System.out.println("Bienvenido a mi app");
		System.out.println("Seleccione una opcion: ");
		System.out.println("1-Listar libros");
		System.out.println("2-Listar revistas");	
		System.out.println("3-Prestar libro");	
		System.out.println("4-Devolver libro");	
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int opcion=scan.nextInt();
	
		switch (opcion) {
		case 1:
			
			for (int i = 0; i < Inventory.articles.length; i++) {
				
				
				if(Inventory.articles[i] instanceof Book) {
					
					Book temp=(Book) Inventory.articles[i];
										
					System.out.println("Libro: " + temp.getTitle()+ ", numero: " + temp.getId());
				}
			}
			System.out.println("**********************************************");	
			break;
		case 2:
			
			for (int i = 0; i < Inventory.articles.length; i++) {
				
				if(Inventory.articles[i] instanceof Magazine) {
					
					Magazine temp=(Magazine) Inventory.articles[i];
					
					System.out.println("Revista: " + temp.getTitle() +", numero: " + temp.getNumber());
				}
			}
			System.out.println("**********************************************");			
			break;
			
		case 3:
			
			printMenuLeanBook();			
			System.out.println("**********************************************");			
			break;
		case 4:
			printMenuReturnBook();			
			System.out.println("**********************************************");			
			break;
		default:
			System.out.println("Opcion Erronea");			
			break;
		}
		
		printMenuPrincipal();
	
	}
	
	public static void printMenuLeanBook() {
		
		System.out.println("Selecciona el libro que quieres consultar");
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int option=scan.nextInt();
		
		for (int i = 0; i < Inventory.articles.length; i++) {
			
			if(Inventory.articles[i] instanceof Book) {
				
				Book book = (Book)Inventory.articles[i];
				
				if(book.getId()==option) {
					if((book.isLean())) {
						System.out.println("Estas seguro de que quieres el libro "+book.getTitle());
						System.out.println("1=si/2=no");
						option=scan.nextInt();
						if (option==1) {
							book.Lend();
						
						}
						else if(option==2) {
							printMenuPrincipal();
						}
					}
					else
						System.out.println(book.getTitle()+" ha sido prestado");
				}
			}
			
		}
		
		printMenuPrincipal();
	
		
	}
public static void printMenuReturnBook() {
		
		System.out.println("Selecciona el libro que quieres consultar");
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int option=scan.nextInt();
		
		for (int i = 0; i < Inventory.articles.length; i++) {
			
			if(Inventory.articles[i] instanceof Book) {
				
				Book book = (Book)Inventory.articles[i];
				
				if(book.getId()==option) {
					if(!(book.isLean())) {
						System.out.println("Estas seguro de que quieres devolver el libro "+book.getTitle());
						System.out.println("1=si/2=no");
						option=scan.nextInt();
						if (option==1) {
							book.Return();
						
						}
						else if(option==2) {
							printMenuPrincipal();
						}
					}
					else
						System.out.println(book.getTitle()+" no ha sido prestado");
				}
			}
			
		}
		
		printMenuPrincipal();
	
		
	}
	
	
}


