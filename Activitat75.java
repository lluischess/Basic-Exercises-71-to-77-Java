package Program4;

import java.util.Scanner;

/*75. Donada una taula de n elements enters, buscar el valor maxim, i el lloc on es troba aquest valor,
tenint en compte que no poden existir valors repetits. Aquests numeros seran introduits pel
teclat validant que no hi hagi duplicacions, finalitzant la serie amb el -999.*/

public class Activitat75 {
	private static int llargada = 100;
	public static void main(String[]args){
		Scanner lector = new Scanner(System.in);
			
		//variables
		int index, numero, Busqueda;
		int Grande, posicion; 

		//Taula
		int []Taula = new int [llargada];
		
		//Pregunta a l'usuari
		System.out.println("Introduce una serie de numeros, para acabar introduce -999");
		numero = lector.nextInt();
		
		index = 1;

		while ((numero != -999)&&(index < llargada)){
			Busqueda = 0;
			
			while((Busqueda < index) && (Taula[Busqueda]!= numero)){
				Busqueda++;
		}
			if(Busqueda == index){
				Taula[index]=numero;
				index++;
			}
			else{
				System.out.println("El numero esta repetido, introduce otro numero que no este repetido y para acabar escribe -999");
			}
			numero = lector.nextInt();
		}
		
		Grande = Taula[0];
		posicion =0;
		
		
		for (Busqueda=1; Busqueda < index; Busqueda++) {
			if (Taula[Busqueda]>Grande) {
				Grande = Taula[Busqueda];
				posicion = Busqueda;
			}
		}
		
		System.out.print("El numero mes grande es: "+Grande+" , que esta en la posicion "+posicion);
		
	lector.close();
	}
}
