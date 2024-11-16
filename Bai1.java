package hoidanit;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		// Bai 1
		Scanner scanner = new Scanner(System.in);

		System.out.println(" Student name: ");
		String name = scanner.nextLine();
		System.out.println("GPA: ");
		int gpa = scanner.nextInt();

		System.out.println(name + " co GPA: " + gpa);
		scanner.close();
	}
}
