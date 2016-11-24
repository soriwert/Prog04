import java.util.Scanner;
public class Ejercicio02{

	public static void main (String[] args){
		Scanner teclado = new Scanner (System.in);
		String frase;
		int i, mayus=0, minus=0;
		char letra;
		frase.

		System.out.print("Introduce una frase: ");
		frase=teclado.nextLine();

		while (frase.length() > 80){
			System.out.println("Has introducido mas de 80 caracteres. Introduce una frase: ");
			frase=teclado.nextLine();
		}

		for (i=0; i<frase.length(); i++){
			letra=frase.charAt(i);
			//System.out.println(letra);
			if (letra>='a'&& letra <='z'){
				minus++;
			}
			else if (letra >='A'&&letra<='Z'){
					mayus++;
				
			}
		}
		System.out.println("mayus = "+mayus);
		System.out.println("minus = "+minus);



	}
}








