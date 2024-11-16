package hoidanit;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		// Bai 2
		Scanner scanner = new Scanner(System.in);

		System.out.println("Chieu dai: ");
		int chieuDai = scanner.nextInt();
		System.out.println("Chieu rong: ");
		int chieuRong = scanner.nextInt();

		int chuVi = (chieuDai + chieuRong) * 2;
		int dienTich = chieuDai * chieuRong;
		int canhMin = Math.min(chieuDai, chieuRong);
		System.out.println("Chu vi hinh chu nhat la: " + chuVi);
		System.out.println("Dien tich hinh chu nhat la: " + dienTich);
		System.out.println("Canh nho nhat la: " + canhMin);
		scanner.close();
	}
}
