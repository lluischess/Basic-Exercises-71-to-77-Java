package Program4;

import java.util.Scanner;

public class Activitat76 {
	public static final int llargada  = 10; //numero allargado de la taula
	public static void main(String [] args) {
		int num;
		int index2,aux;
		int index = 0;
		int anterior;
		int parells;
		Scanner teclea = new Scanner(System.in);
		System.out.println("Realitzar un algoritme que donada una taula de N elements, canvir cada element parell per l’element senar anterior. Si la taula té un nombre imparell d’elements l’últim no es canvia amb ningú,finalment mostrar per pantalla la taula modificada.");
		int[] taula = new int [llargada];
		System.out.println("Introdueix una sequencia de numeros(limit 10)");
		num = teclea.nextInt();
		while ((num!=0) && (index<llargada)){ // declarar nombres dins de la taula
			taula[index]= num;
			index++;
			
				num = teclea.nextInt();
			
		}
		for (parells = 1;parells<index;parells=parells+2) { //intercamvi dels calaixos parells als imparells
			anterior = parells -1;
			aux = taula[parells];
			taula[parells] = taula[anterior];
			taula [anterior]=aux;
		}
		for(index2=0;index2<index;index2++){
			System.out.println(taula[index2]);
		}
		
		teclea.close();
	}
}

