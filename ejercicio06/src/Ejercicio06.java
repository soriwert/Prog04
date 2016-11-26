import java.util.Scanner;
public class Ejercicio06 {
	public static void main (String[] args){
		Scanner teclado = new Scanner (System.in);

		String frase, diferentes="";
		int contNum=0, numVocales=0, numConsonantes=0, otros=0;
		char letra, coma=',';




		do{

			System.out.println("Escriba una frase");
			frase=teclado.nextLine();

		}while (frase.length()>80);

		for (int i=0; i<frase.length();i++){
			letra=frase.charAt(i);


			// el siguiente if, delimita los valores que puede coger.
			if(letra>='a'&&letra<='z'||letra>='A'&&letra<='Z'||letra>='0'&&letra<='9'){

				if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'){
					numVocales++;
				}
				else if (letra=='0'||letra=='1'||letra=='2'||letra=='3'||letra=='4'||letra=='5'||letra=='6'||letra=='7'||letra=='7'||letra=='8'||letra=='9'){
					contNum++;
				}
				else
					numConsonantes++;
			}
			else

				diferentes+=frase.charAt(i);
			otros=diferentes.length();

		}
		System.out.println("Número de vocales: "+numVocales);
		System.out.println("Número de consonantes: "+numConsonantes);
		System.out.println("Número de digitos: "+contNum);
		System.out.println("Caracteres diferentes: "+otros+ " (los huecos en blanco son espacios): "+diferentes);


	}
}