import java.util.Scanner;
public class Ejercicio05 {
	public static void main (String[] args){
		Scanner teclado = new Scanner (System.in);

		String frase;

		System.out.println("Introduzca una frase: ");
		frase = teclado.nextLine();


		do{

		} while (frase.length()>80);

		System.out.print("Los caracteres pares son: ");
		for(int i=0; i<frase.length();i++){
			if (i%2==0){
				System.out.print(frase.charAt(i));
			}
		}

		System.out.println();
		System.out.print("Los caracteres impares son: ");
		for(int cont=0; cont<frase.length();cont++){
			if (cont%2!=0){
				System.out.print(frase.charAt(cont));
			}


		}




	}

}


		
