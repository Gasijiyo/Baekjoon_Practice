package baekjoon.java;

import java.util.Scanner;

public class _10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int[] arr = new int[first];
		int count = 0;
		
		for (int i = 0 ; i < first ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		
		for (int i = 0 ; i < arr.length ; i++) {
			if (v == arr[i]) {
				count++;
			}
		}		
		sc.close();	
		System.out.println(count);
	}

}
