import java.util.Scanner;
public class Ejercicio07 {
	public static void main (String[] args){
		Scanner teclado = new Scanner (System.in);

		String frase;
		char letra;
		int minus=0,mayus=0,num=0, otros=0;

		System.out.println("Escriba una frase: ");
		frase=teclado.nextLine();
		System.out.println("Caracteres totales: "+frase.length());

		for (int i=0; i<frase.length();i++){

			letra=frase.charAt(i);

			if (letra>='a'&& letra<='z')
				minus++;


			else if (letra>='A'&&letra<='Z')
				mayus++;


			else if (letra>='0'&&letra<='9')
				num++;


			else 
				otros++;



		}
		System.out.println("Número de minúsculas: "+minus+"\nNúmero de mayusculas: "+mayus);
		System.out.println("Número de dígitos: "+num+"\nCarácteres diferentes: "+otros);

	}
}