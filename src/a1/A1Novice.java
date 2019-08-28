package a1;

import java.util.Scanner;
import java.text.DecimalFormat;


public class A1Novice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int customers = scan.nextInt();
		for (int i = 0; i < customers; i++) {
			String f = scan.next();
			String l = scan.next();
			int items = scan.nextInt();
			double sum = 0;
			for (int j = 0; j < items; j++) {
				int count = scan.nextInt();
				String itemname = scan.next();
				double price = scan.nextDouble();
				sum += (price * count);
			}
			System.out.println(f.substring(0,1) + '.' + l + ':' + new DecimalFormat("#,##0.00").format(sum));

		}
	}

}
