package hoidanit;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		// Bai 3
		Scanner scanner = new Scanner(System.in);

		System.out.println("Canh hinh lap phuong la: ");
		int canh = scanner.nextInt();
		double theTich = Math.pow(canh, 3);
		System.out.println("The tich hinh lap phuong la: " + theTich);
		scanner.close();
	}
}
