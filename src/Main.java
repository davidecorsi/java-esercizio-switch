/*
 Costruite una semplice calcolatrice tascabile. Il programma deve scrivere il risultato 
 dopo aver ricevuto 2 numeri interi e il simbolo dell'operazione desiderata
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci l'operazione da eseguire ");
		String o = input.nextLine();
		System.out.print("Inserisci il primo numero ");
		int x = input.nextInt();
		System.out.print("Inserisci il secondo numero ");
		int y = input.nextInt();
	} 
}
