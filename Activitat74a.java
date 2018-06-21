package Program4;

import java.util.Scanner;

public class Activitat74a {
	public static final int range = 9;
	public static void main(String [] args) {

		//variables
		int cambi;
		//possicio de la taula
		int index;
		int ultima;
		//definir scanner i taula
		Scanner teclea = new Scanner(System.in);
		int[] taula = new int [range];
		System.out.println(".Realitzar un algoritme que ens permeti entra n nombres enters en una taula i a continuació que inverteixi la taula "
				+ "(el primer element passa a l’últim introduït, el segon al penúltim,...). Una vegada invertida la taula mostrar-la per pantalla");

		//Omplir la taula
		for (index=0;index<range;index++){
			System.out.println("Introdueix els numeros de la taula: ");
			taula[index] = teclea.nextInt();
		}
		//invertim les taules
		cambi =0;
		ultima = index-1;
		for (index=0;index<range/2;index++){
			cambi = taula[index];
			taula[index] = taula[ultima];
			taula[ultima] = cambi;
			ultima--;
		}

		//imprimim la taula
		System.out.println("LA TAULA ES AQUESTA!"); 
		for (index = 0;index<range;index++){
			System.out.print("|");
			System.out.print(taula[index] +"");
		}
		teclea.close();

	}
}
