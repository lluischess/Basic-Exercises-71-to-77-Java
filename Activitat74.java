package Program4;

import java.util.Scanner;

public class Activitat74 {
	public static final int llargada = 10;
	public static void main(String [] args) {
		int cambi = 0;
		int num = 0 ;
		int ultima;
		int index;
		Scanner teclea = new Scanner(System.in);
		System.out.println(".Realitzar un algoritme que ens permeti entra n nombres enters en una taula i a continuació que inverteixi la taula (el primer element passa a l’últim introduït, el segon al penúltim,...). Una vegada invertida la taula mostrar-la per pantalla");
		System.out.println("Introdueix una seqüencia de números(limit 10 numeros)");
		int[] taula = new int [llargada];
		for ( index = 0; index<llargada;index++){
			num = teclea.nextInt();
			taula[index] = num;
			System.out.println(taula [index]+" ");
		}
		ultima = index-1;
			for (int i = 0;i<=llargada/2;i++) {
				cambi = taula [i];
				taula[i] = taula [ultima];
				taula [ultima] = cambi;
				ultima--;
				
			}
			for (index = 0;index<llargada;index++) {
				System.out.println(taula [index]+" Invertit ");
			}
		
		teclea.close();
		
	}
}
