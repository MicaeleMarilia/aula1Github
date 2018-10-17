package program;

import java.util.Locale;
import java.util.Scanner;

import entites.Aluguel;

public class Pensionato {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluguel[] aluguel = new Aluguel[10];
		System.out.print("How many rooms will be rented? ");
		int count = sc.nextInt();
		
		for (int i = 1; i <= count; i++){
			System.out.println("Rent #"+i+":");
			sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			
			aluguel[quarto] = new Aluguel(nome, email);	
		}
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < aluguel.length; i++){
			if (aluguel[i] != null) {
				System.out.println(i + ": " + aluguel[i]);
				}
		}
		
		sc.close();
	}
}
