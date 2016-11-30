import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		String frase;
		int n,fraseCode=0,opcion,supera=0;
		
		

		System.out.println("Escriba una frase:");
		frase=teclado.nextLine();
		frase=frase.toUpperCase();
		
		

		System.out.println("Elija un número del 1 al 10 para codificar/decodeificar");
		n=teclado.nextInt();
		int calculo=(int)'A'+n-1;

		do{
			System.out.println("¿Qué desea?\n1.Codificar\n2.Decodificar");
			opcion=teclado.nextInt();
			if(opcion>2||opcion<=0)
				System.out.println("¡Error! número invalido. Por favor ingrese otro número:");

		}while(opcion>2);


		for (int i=0;i<frase.length();i++){
			//codificado dentro del margen
			fraseCode=0;
			supera=0;
			if (((int)frase.charAt(i)+n)>=(int)'A'&&((int)frase.charAt(i)+n)<=(int)'Z'){
				fraseCode+=(int)frase.charAt(i)+n;
				System.out.print("\n1 Muestra "+(char)(fraseCode)+" porfa");
				
			}
			
			//codificado fuera del margen por debajo
			
			else if ((int)frase.charAt(i)>=49&&(int)frase.charAt(i)<65){
				supera=(int)frase.charAt(i)-49+calculo;
				System.out.print("2 Muestra "+(char) supera+" porfa");
			}
			
			else if ((int)frase.charAt(i)>=33){
				supera=49-(int)frase.charAt(i)+calculo;
				System.out.print("3 Muestra "+(char) supera+" porfa");
				
			}
			else if ((int)frase.charAt(i)==32){
				supera=33-(int)frase.charAt(i)+calculo;
				System.out.print("4 Muestra "+(char) supera+" porfa");
			}
			
			//codificado fuera del margen por arriba			
			else if ((int)frase.charAt(i)<=106){
				supera=(int)frase.charAt(i)-90+calculo;
				System.out.print("5 Muestra "+(char) supera+" porfa");
				
			}
						
			else if ((int)frase.charAt(i)<=122){
				supera=(int)frase.charAt(i)-106+calculo;
				System.out.print("6 Muestra "+(char) supera+" porfa");
				
			}
			else if ((int)frase.charAt(i)<=138){
				supera=(int)frase.charAt(i)-122+calculo;
				System.out.print("7 Muestra "+(char) supera+" porfa");
				
			}
			else if ((int)frase.charAt(i)<=154){
				supera=(int)frase.charAt(i)-138+calculo;
				System.out.print("8 Muestra "+(char) supera+" porfa");
				
			}
			else if ((int)frase.charAt(i)<=170){
				supera=(int)frase.charAt(i)-154+calculo;
				System.out.print("9 Muestra "+(char) supera+" porfa");
				
			}
			else if ((int)frase.charAt(i)<=186){
				supera=(int)frase.charAt(i)-170+calculo;
				System.out.print("10 Muestra "+(char) supera+" porfa");
				
			}
			else if ((int)frase.charAt(i)<=202){
				supera=(int)frase.charAt(i)-186+calculo;
				System.out.print("11 Muestra "+(char) supera+" porfa");
				
			}
			else if ((int)frase.charAt(i)<=218){
				supera=(int)frase.charAt(i)-202+calculo;
				System.out.print("12 Muestra "+(char) supera+" porfa");
				
			}
			else if ((int)frase.charAt(i)<=234){
				supera=(int)frase.charAt(i)-218+calculo;
				System.out.print("13 Muestra "+(char) supera+" porfa");
				
			}
			else if ((int)frase.charAt(i)<=250){
				supera=(int)frase.charAt(i)-234+calculo;
				System.out.print("14 Muestra "+(char) supera+" porfa");
				
			}
				else
					System.out.println("miau");
			}
			
		}

	}

