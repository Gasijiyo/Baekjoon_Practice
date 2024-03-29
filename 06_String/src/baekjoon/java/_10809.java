package baekjoon.java;

import java.util.Scanner;

public class _10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		int[] arr = new int[26];		
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = -1;
		}
		
		for (int i = 0; i < s.length() ; i++) {
			char ch = s.charAt(i);
			if (arr[ch-'a'] == -1) {	// arr원소값이 -1인 경우에만 초기화
				arr[ch-'a'] = i;
			}		
		}	
		
		for (int chValue : arr) {
			System.out.print(chValue + " ");
		}
        
	}

}
