package baekjoon.java;

import java.util.Scanner;

public class _11645 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        sc.close();
        int total = 0;
        for (int i = 0; i < N; i++){            
            int a = s.charAt(i)-48;            
            total += a;
        }
        System.out.println(total); 
	}

}
