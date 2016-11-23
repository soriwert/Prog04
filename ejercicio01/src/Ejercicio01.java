import java.util.Scanner;
public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
//	Leer una frase de máximo 80 caracteres y escribirla progresivamente
		
		String entrada;
		int i;
		int siguiente;
		
//	La siguiente instrucción solicita la frase
		System.out.println ("Escriba una frase: ");
		entrada=teclado.nextLine();

//	En el if condicionamos el programa a ser menor de 80 caracteres
		if (entrada.length()<=80){

//	Utilizamos un doble for, el primero se realizará si i es menor que 80, si es así incrementa i.
//	El bucle finaliza cuando no le queden más letras por leer.
			for(i=1; i<entrada.length();i++)
			{
/*	El siguiente for anidado, coge la variable siguiente como valor 0 y la incrementa mientras
 *  sea menor o igual que i. Cuando lo supera sale del bucle y el contador siguiente vuelve a 0,
 *  cada vez que realiza el bucle imprime la letra de la posición de la frase cogiendo el valor de 
 *  la variable entrada.
 */

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