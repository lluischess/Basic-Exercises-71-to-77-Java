package Program4;

import java.util.Scanner;

public class Activitat72a {
	public static final int range = 11;
	public static void main(String [] args) {

		//variables
		int negatiu;
		int positiu;
		int neutre;
		//possicio de la taula
		int index;

		//definir scanner i taula
		Scanner teclea = new Scanner(System.in);
		int[] taula = new int [range];
		System.out.println("Donada una taula de n elements enters, introdu�ts per l�usuari, fer un algoritme "
				+ "que ens indiqui quants d�aquests s�n negatius i quants no. El zero es considera neutre.");
		//Omplir taula
		for (index = 1;index<range;index++){
			System.out.println("Introdueix el numero de la possicio "+index+":");
			taula[index] = teclea.nextInt();

		}

		//buscar negatius positius o neutre
		negatiu = 0;
		positiu = 0;
		neutre = 0;
		for (index = 1;index<range;index++){

			if (taula[index]==0){
				neutre++;
			}else if (taula[index]>0){
				positiu++;
			}
			else{
				negatiu++;
			}

		}
		
		System.out.println("Els negatius s�n: "+negatiu);
		System.out.println("Els positius s�n: "+positiu);
		System.out.println("Els neutres s�n: "+neutre);

		teclea.close();

	}
}
