import java.util.Scanner;
public class Ejercicio04 {
	public static void main (String[] args){
		Scanner teclado = new Scanner (System.in);

		String frase;
		int opcion;
		boolean repetir=true;

		do{ 
			System.out.println("Escriba una frase: ");
			frase=teclado.nextLine();


		} while (frase.length()>80);



		do{
			System.out.println("Elija una opción indicando el número 1 o 2:");
			System.out.println("1. Mayúsculas.");
			System.out.println("2. Minúsculas.");
			opcion=teclado.nextInt();
			if (opcion > 2)
				System.out.print("¡¡¡Error!!! ");

		} while (opcion>2 );

		switch (opcion){
		case 1:
			System.out.println(frase.toUpperCase());
			break;
		case 2:
			System.out.println(frase.toLowerCase());
			break;
		
		}
	}
	
}

	







