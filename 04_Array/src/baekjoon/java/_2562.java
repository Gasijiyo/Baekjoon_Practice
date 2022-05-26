package baekjoon.java;
import java.util.*;

public class _2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		
		for (int i = 0 ; i < 9 ; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int max = 0;
		int i = 0;
		for (int a = 0; a < 9 ; a++) {
			if (arr[a] > max) {
				max = arr[a];
				i = a;
			}
		}
		System.out.println(max);
		System.out.println(i + 1);		
	}

}
