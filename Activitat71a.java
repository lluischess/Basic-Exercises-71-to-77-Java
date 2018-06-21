package Program4;

import java.util.Scanner;

public class Activitat71a {
	public static final int range = 11;
	public static void main(String [] args) {
		
		//variables
		int sum;
		//possicio de la taula
		int index;
		
		//definir scanner i taula
		Scanner teclea = new Scanner(System.in);
		int[] taula = new int [range];
		
		System.out.println(".Donada una taula de n elements de enters, introduïts per l’usuari, fer "
				+ "un algoritme que ens digui la suma total dels elements de la taula");
		
		//Omplir taula
		for (index = 1;index<range;index++){
		System.out.println("Introdueix el numero de la possicio "+index+":");
		taula[index] = teclea.nextInt();
		
		}
		//Sumar numeros de la taula
		sum = 0;
		for (index = 1;index<range;index++){
			sum = sum + taula[index];
			
			}
		
		System.out.println("La suma de la taula es: "+sum+":");
		teclea.close();
	}
}
