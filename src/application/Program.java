package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

	public class Program {

		public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão: ");
		
		System.out.print("Nome: ");
			String name = sc.nextLine();
		
		System.out.print("Vida inicial: ");
			int life = sc.nextInt();
			
		System.out.print("Ataque: ");
			int attack = sc.nextInt();
			
		System.out.print("Armadura: ");
			int armor = sc.nextInt();
		
		sc.nextLine();
		
		Champion championA = new Champion(name, life, attack, armor);
			championA.champion(name, life, attack, armor);
		System.out.println();
		
		System.out.println("Digite os dados do segundo campeão: ");
		
		System.out.print("Nome: ");
			name = sc.nextLine();
			
		System.out.print("Vida inicial: ");
			life = sc.nextInt();
			
		System.out.print("Ataque: ");
			attack = sc.nextInt();
		
		System.out.print("Armadura: ");
			armor = sc.nextInt();
		
		Champion championB = new Champion(name, life, attack, armor);
			championB.champion(name, life, attack, armor);
			
		System.out.println();		
		System.out.print("Quantos turnos você deseja executar? ");
			int shifts = sc.nextInt();
		
		for (int i = 1; i <= shifts; i++) {
			
			System.out.println();
			System.out.printf("Resultado do turno "+ i +":");
			
			System.out.println();
				championA.takeDamage(championB);
				
			System.out.println(championA.status());
				championB.takeDamage(championA);
				
			System.out.println(championB.status());
			
			if(championA.getLife() == 0) {
				break;
			}
			if (championB .getLife() == 0) {
				break;
			}
		}
		
		System.out.println();
		System.out.println("FIM DE COMBATE");
		
		sc.close();
	}
}