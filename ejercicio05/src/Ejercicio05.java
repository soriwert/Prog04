import java.util.Scanner;
public class Ejercicio05 {
	public static void main (String[] args){
		Scanner teclado = new Scanner (System.in);

		String frase,par="",impar="";
		char letra;
		

		System.out.println("Introduzca una frase: ");
		frase = teclado.nextLine();


		do{

		} while (frase.length()>80);

		
		for(int i=1; i<frase.length()+1;i++){
			letra=frase.charAt(i-1);
			if (i%2==0)
				par+=letra;
				
							
			else
				impar+=letra;
			}

		System.out.print("Los caracteres impares son: "+impar+"\n");
		System.out.print("Los caracteres pares son: "+par);
		}
		
		


	}


