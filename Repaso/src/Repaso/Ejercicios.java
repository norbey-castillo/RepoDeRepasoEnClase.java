package Repaso;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicios {
	static Scanner sc = new Scanner(System.in);
	
					//	PROGRAMA 1
	public static void Programa1() {
		
		int suma = 0;
		
		try {
			System.out.print("Ingrese un numero n: ");
			int numero = sc.nextInt();
			
			for(int i = 1; i <= numero; i++) {
				if(i % 4 == 0) {
					suma += i;
				}
			}
			
			System.out.print("La suma de los numeros divisibles entre 4 es: "+suma);
			
		}catch(InputMismatchException e) {
			System.out.println("Valor invalido");
		}
	}

	
	public static void main(String[] args) {
		

	}

}
