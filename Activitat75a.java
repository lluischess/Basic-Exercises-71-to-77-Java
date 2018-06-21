package Program4;

import java.util.Scanner;

/*75. Donada una taula de n elements enters, buscar el valor maxim, i el lloc on es troba aquest valor,
tenint en compte que no poden existir valors repetits. Aquests numeros seran introduits pel
teclat validant que no hi hagi duplicacions, finalitzant la serie amb el -999.*/

public class Activitat75a {
	public static final int range = 9;
	public static void main(String [] args) {

		//variables
		int num =0;
		//possicio de la taula
		int index;
		int gran;
		int posicioGRAN;
		int anularrepes;
		//definir scanner i taula
		Scanner teclea = new Scanner(System.in);
		int[] taula = new int [range];
		//Omplir la taula (NO valors repetits) (sortir -999)
		System.out.println("Introdueix els numeros de la taula si vols finalitzar introdueix el -999: ");
		num = teclea.nextInt();
		index =1;
			while (num != -999 && index<range){
				anularrepes = 0;
				//bucle per buscar dins de la taula si hi han repetits
				while ((anularrepes < index) && (taula[anularrepes] != num)){
					anularrepes++;
				}
				
				if (anularrepes == index){
					taula[index]=num;
					index++;
				} else {
					System.out.println("El numero ya existeix a la taula introdueix un altre: ");
				}
				num = teclea.nextInt();
				
			}
			
		// Buscar el valor maxim
			
			posicioGRAN =0;
			gran = taula[index];
			for (index = 0;index <range;index++ ){
				if (taula[index]>gran){
					gran = taula[index];
					posicioGRAN = index;
				}
			}
			
			System.out.println("El numero mes gran: "+gran+" esta a la posicio: "+posicioGRAN);
		
	}
}
