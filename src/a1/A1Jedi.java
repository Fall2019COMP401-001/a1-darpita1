package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numofitems = scan.nextInt();


		String[] itembank = new String[numofitems];	
		// Double[] prices = new Double[numofitems];	
		for (int j=0; j<itembank.length; j++) {
			itembank[j] = scan.next();
			Double prices = scan.nextDouble();	
			}
		int customers = scan.nextInt();
		//String[] firstnames = new String[customers];
		//String[] lastnames = new String[customers];
		int[] countofitem = new int[itembank.length];
		int[] countofcustomer = new int[itembank.length];
		for (int j=0; j<customers; j++) {
			String firstname = scan.next();
			String lastname = scan.next();
			int itemsbought = scan.nextInt();
			for (int k=0; k < itemsbought; k++) {
				int numofitem = scan.nextInt();
				String itemname = scan.next();
				for (int i = 0; i < itembank.length; i++) {
					if (itembank[i].equals(itemname)) {
						countofitem[i] += numofitem;
						countofcustomer[i] += 1;
					}
	
				}
					
			}
		}
		for (int x=0; x < itembank.length; x++) {
			if (countofitem[x] == 0) {
				System.out.println("No customers bought " + itembank[x]);
			}
			else {
				System.out.println(countofcustomer[x] + " customers bought " + countofitem[x] + " " + itembank[x]);
			}
			
		}
	}
}
