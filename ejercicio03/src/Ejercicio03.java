import java.util.Scanner;
public class Ejercicio03 {
	public static void main(String[] args){
		Scanner teclado = new Scanner (System.in);
		String frase, palabra;
		int cero=0;
		
		
		System.out.println("Escriba una frase: ");
		frase=teclado.nextLine();
		System.out.println("Escriba una palabra: ");
		palabra=teclado.nextLine();
		
		if (frase.indexOf(palabra)>=0)
			System.out.println(frase.indexOf(palabra));
		else 
				System.out.println(cero);

				
			
		
	}

}
