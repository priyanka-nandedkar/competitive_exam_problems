package practice.org;

import java.util.Scanner;

public class WhoIsSmarter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;

		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println(smarterOne(a, b));
		sc.close();
	}

	private static int smarterOne(int a, int b) {
		int revA = 0, revB = 0;
		while (a != 0) {
			int digit = a % 10;
			revA = revA * 10 + digit;
			a /= 10;
		}

		while (b != 0) {
			int digit = b % 10;
			revB = revB * 10 + digit;
			b /= 10;
		}

		if (revA > revB)
			return revA;
		else if (revA < revB)
			return revB;
		return revA;

	}

}
