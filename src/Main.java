/*
 Costruite una semplice calcolatrice tascabile. Il programma deve scrivere il risultato 
 dopo aver ricevuto 2 numeri interi e il simbolo dell'operazione desiderata
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il primo numero ");
		int x = input.nextInt();
		System.out.print("Inserisci il secondo numero ");
		int y = input.nextInt();
		input.nextLine();
		System.out.print("Inserisci l'operazione da eseguire ");
		String o = input.nextLine();
		Integer r = null;
		switch(o) {
			case "+":
				r = x + y;
				break;
			case "-":
				r = x - y;
				break;
			case "*":
				r = x * y;
				break;
			case "/":
				r = x / y;
				break;
			default:
				System.out.println("Operazione non consentita");
		}
		if(r != null) {
			System.out.println("Il risultato dell'operazione è " + r);
		}
	} 
}
