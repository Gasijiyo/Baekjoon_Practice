package baekjoon.java;

import java.util.Scanner;

public class _1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		sc.close();
		int newNum = start;
		int count = 0;

		while (true) {
			start = ((start % 10) * 10) + (((start / 10) + (start % 10)) % 10);
			count++;
			if (newNum == start) {
				break;
			}
		}
		System.out.println(count);

	}

}
