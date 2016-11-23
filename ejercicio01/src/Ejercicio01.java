import java.util.Scanner;
public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String entrada;
		int i;
		int siguiente;

		System.out.println ("Escriba una frase: ");
		entrada=teclado.nextLine();

		if (entrada.length()<=80){

			for(i=1; i<entrada.length();i++)
			{
				for (siguiente=0; siguiente<=i; siguiente++)
				{
					System.out.print (entrada.charAt(siguiente) );
				}
				System.out.println();
			}
			System.out.print(entrada);
		}
		else {
			System.out.println("La frase supera los 80 caracteres.");
		}

	}
}