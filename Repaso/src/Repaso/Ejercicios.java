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

					
					//	PROGRAMA 2
	public static int factorial(int numero) {
		if(numero == 0) {
			System.out.print("El numero 0 no tiene factorial. ");
			return -1;
		}
		if(numero == 1 || numero == 2) {
			return 1;
		}
		int resultado = 1;
		for(int i = 2; i <= numero; i++) {
			resultado = resultado * i;
		}
		
		return resultado;
	}
	public static void Programa2() {
		System.out.print("Ingrese un numero para ver su factorial: ");
		int numero = sc.nextInt();
		
		int Factorial = factorial(numero);
		
		System.out.println("El factorial de: "+numero+" Es: "+Factorial);
	}
	
	
	public static void main(String[] args) {

	}

}
