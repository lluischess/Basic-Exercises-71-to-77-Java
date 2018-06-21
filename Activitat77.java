package Program4;

import java.util.Scanner;

public class Activitat77 {
	public static final int llargada  = 10;
	public static void main(String [] args) {
		double numt, suma=0 ,mitjana=0;
		int index2 = 0;
		int index = 0;
		Scanner teclea = new Scanner(System.in);
		System.out.println("Tenim N temperatures guardades en una taula, Calcular la mitja i obtenir el número de temperatures més grans o iguals a la mitja.");
		System.out.println("Introdueix una seqüencia de temperatures(limit 10 numeros)");
		numt = teclea.nextDouble();
		double[] taula = new double [llargada];
		while ((numt!=0) && (index<llargada)){ // declarar nombres dins de la taula
			taula[index]= numt;
			index++;
			numt = teclea.nextDouble();
			
		}
		
		for (index2=0;index2<index;index2++){
			System.out.println(taula[index2]+"");
			
			suma=suma+taula[index2];
		}
		
		mitjana=suma/index2;
		System.out.println("La mitjana es:"+mitjana+"");
         
		for (index2=0;index2<index;index2++){
			if (taula[index2]>=mitjana){
				System.out.println(taula[index2]+"");
			}
				
		}
		teclea.close();
		
	}
}

