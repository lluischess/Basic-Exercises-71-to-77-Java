package Program4;

import java.util.Scanner;

public class Activitat71 {
	public static final int llargada = 9;
	public static void main(String [] args) {
		
		int numu;
		int sum = 0;
		int index;
		
		Scanner teclea = new Scanner(System.in);
		System.out.println(".Donada una taula de n elements de enters, introdu�ts per l�usuari, fer un algoritme que ens digui la suma total dels elements de la taula");
		int[] taula = new int [llargada];
		index=0;
		System.out.println("Introdueix una seq�encia de n�meros tenint en compte que el l�mit son 11 n�meros contat el 0.");
		numu = teclea.nextInt();
		//farcir
		while ((numu!=0) && (index<llargada)){ 
			 
			//index = valor declarado en un cajon
			taula[index]= numu;
			index = index+1;
			sum = sum + numu;
			System.out.println("El numero que es sumara "+index+" mes el anterior " +sum+"");
			numu = teclea.nextInt();
		}
		
		System.out.println("La suma de la taula de n�meros es: "+sum+"");
		
		teclea.close();
	}
}
