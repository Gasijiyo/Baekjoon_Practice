package baekjoon.java;

import java.util.Scanner;

public class _5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[31];
		
		for (int i = 1; i < 29 ; i++) {            
			arr[sc.nextInt()] = 1;			
		}
		for (int i = 1 ; i < arr.length ; i++ ) {
			if (arr[i] != 1) {
				System.out.println(i);
			}
		}
		sc.close();	
		
	}
}
