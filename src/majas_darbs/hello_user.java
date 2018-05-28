package majas_darbs;

import java.util.Scanner;

public class hello_user {
	
	public static void main(String[] args) {

		        Scanner ievade = new Scanner(System.in);
		
		System.out.print("*********Lūdzu norādi kādu mēneša datumu  *******");
		int datums = ievade.nextInt();
		System.out.print("********Lūdzu norādi kādu mēnesi *********");
		int menesi = ievade.nextInt();
		System.out.print("Lūdzu norādi gada skaitli  ************");
		int gads = ievade.nextInt();
		
		String [] menesuNosaukumi = {"Janvâris", "Februâris", "Marts", "Aprîlis",
				"Maijs", "Jûnijs", "Jûlijs", "Augusts", "Septembris",
				"Oktobris", "Novembris", "Decembris"};
		
		
		
	
		if (datums == 31 && (menesi == 4 || menesi == 6 || menesi == 9 || menesi == 11)) {
			System.out.println("Ðâda datuma konkrçtajâ mçnesî nav!");
		} else if (menesi == 2 && (gads % 4 != 0) && (datums == 29)) {
			System.out.println("šis ir mini gads!");
			
		} else {
		
		System.out.println("ievadītais datums: " + gads + " " + ".gada"+ "  "  + datums + ". "
		+ menesuNosaukumi [menesi-1]  + " !!! ");
		}
	}
	

}


