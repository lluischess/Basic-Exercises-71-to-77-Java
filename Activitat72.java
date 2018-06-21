package Program4;

import java.util.Scanner;

public class Activitat72 {
	public static final int llargada = 9;
	public static void main(String [] args) {
		int num;
		int Negatius=0;
		int Positivo=0;
		int index;
		Scanner teclea = new Scanner(System.in);
		System.out.println("Donada una taula de n elements enters, introduïts per l’usuari, fer un algoritme que ens indiqui quants d’aquests són negatius i quants no. El zero es considera neutre.");
		index=0;
		System.out.println("Introdueix una seqüencia de números");
		num = teclea.nextInt();
		double[] taula = new double [llargada];
		
		while ((num!=0) && (index<llargada)){ 
			taula[index]= num;
			if (num<0){
				Negatius++;
			}
			if (num>0) {
			Positivo++;
			}       
			index++;
			num = teclea.nextInt();
		}
		
		System.out.println("Hi han "+Negatius+" valors negatius i un total "+Positivo+" números positius");
		
		teclea.close();
	}
}
