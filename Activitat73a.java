package Program4;

import java.util.Scanner;

public class Activitat73a {
	public static final int range = 99;
	public static void main(String [] args) {

		//variables
		int quadrat;
		//possicio de la taula
		int index;

		//definir scanner i taula
		int[] taula = new int [range];
		int[] taula2 = new int [range];
		System.out.println("Escriure un algoritme que permeti calcular el quadrat dels 100 primer números"
				+ " enters i a continuació els vagi guardant en una taula.");
		//Omplim la taula
		for (index = 0;index<range;index++){
			taula[index]=index;
		}
		//Fem el calcul
		quadrat = 1;
		for (index = 0;index<range;index++){
			quadrat = 1;
			quadrat = taula[index]* taula[index];
			taula2[index] = quadrat;

			quadrat++;


		}
		//imprimim la taula
		System.out.println("LA TAULA ES AQUESTA!"); 
		for (index = 0;index<range;index++){
			System.out.print("|");
			System.out.print(taula2[index] +"");
		}
	}
}
