package Program4;

public class Activitat73 {
	public static final int llargada = 100;
	public static void main(String [] args) {
		int num = 1;
		int quadrat=0;
		int index;
		
		System.out.println("Escriure un algoritme que permeti calcular el quadrat dels 100 primer números enters i a continuació els vagi guardant en una taula.");
		System.out.println("Introdueix una seqüencia de números");
		
		
		int[] taula = new int [llargada];
		
		for (index=0;index<llargada;index++){
			quadrat = num*num;
			taula[index] = quadrat;
			System.out.println("El quadrat del numero "+num+" es "+quadrat+"");
			num++;
		}
		System.out.println("Fin");
	}
}
