package hoidanit;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap tien: ");
		int tien = scanner.nextInt();

		if (tien < 10) {
			System.out.println("Khong phai dong thue");
		} else if (tien >= 10 && tien < 15) {
			System.out.println("Tien thue 10% ");
		} else if (tien >= 15 && tien <= 30) {
			System.out.println("Tien thue 20% ");
		} else if (tien > 30) {
			System.out.println("Tien thue 50% ");
		}

		System.out.println("tien " + (tien > 0));
		scanner.close();
	}
}
