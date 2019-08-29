package a1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numofitems = scan.nextInt();


		String[] itemnames = new String[numofitems];	
		Double[] prices = new Double[numofitems];	
		for (int j=0; j<itemnames.length; j++) {
			itemnames[j] = scan.next();
			prices[j] = scan.nextDouble();	
			}
		int customers = scan.nextInt();
		Double[] totalprices = new Double[customers];
		String[] firstnames = new String[customers];
		String[] lastnames = new String[customers];
		for (int k = 0; k < customers; k++) {
			// String f = scan.next();
			firstnames[k] = scan.next();
			//String l = scan.next();
			lastnames[k] = scan.next();
			int itemsbought = scan.nextInt();
			Double totalprice = 0.00;
			for (int j = 0; j < itemsbought; j++) {
				int count = scan.nextInt(); //2
				String item = scan.next(); //bananas
				
				int n = 0;
				
				for (int x = 0; x < itemnames.length; x++) {
					if (itemnames[x].equals(item)) {
						n = x;
					}
				}
				//int n = itemnames.indexOf(item); //will this not find the index of itemname in array itemnames
				//int index = -1;
				Double totalpriceofitem = 0.00;
				//for (int n = 0; n < itemsbought; n++) {
				//if (itemnames[n].equals(itemname)) {
				//index = n;
				totalpriceofitem = prices[n] * count;
				totalprice += totalpriceofitem;
			}
			totalprices[k] = totalprice;
		}
	int minindx = findValueMinIndx(totalprices);
	int maxindx = findValueMaxIndx(totalprices);	
	System.out.println("Biggest: " + firstnames[maxindx] + " " + lastnames[maxindx] + " (" +  new DecimalFormat("#,##0.00").format(totalprices[maxindx]) + ")");
	System.out.println("Smallest: " + firstnames[minindx] + " " + lastnames[minindx] + " (" + new DecimalFormat("#,##0.00").format(totalprices[minindx]) + ")");
	System.out.println("Average: " + String.format("%.2f", Average(totalprices)));
	}
	static int findValueMinIndx(Double[] vals) {

		// Initialize current minimum to first value in array.
		Double cur_min = vals[0];
		int cur_min_indx = -1;

		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.

		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
				cur_min_indx = i;
			}
		}

		return cur_min_indx;
	}

	static int findValueMaxIndx(Double[] vals) {

		// Initialize current minimum to first value in array.
		Double cur_max = vals[0];
		int cur_max_indx = -1;


		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.

		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
				cur_max_indx = i;
			}
		}

		return cur_max_indx;
	}

	static Double Average(Double[] vals) {
		Double average = 0.0;
		Double sum = 0.00;
		for (int i = 0; i < vals.length; i++) {
			sum += vals[i];
		average = sum / vals.length;
		}
		return average;
	}
}
