package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2738 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		String firstInput[] = br.readLine().split(" ");		
		int N = Integer.parseInt(firstInput[0]);
		int M = Integer.parseInt(firstInput[1]);
		int finalResult[] = new int[N*M];
		System.out.println("N : " + N + ", M : " + M);
		int m1[][] = new int[N][M];
		int m2[][] = new int[N][M];
		for (int i = 0 ; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int a = 0 ; a < M ; a++) {
				m1[i][a] = Integer.parseInt(st.nextToken());
			}				
		}
		for (int j = 0 ; j < N ; j++) {
			st = new StringTokenizer(br.readLine());
			for (int b = 0 ; b < M ; b++) {
				m2[j][b] = Integer.parseInt(st.nextToken());
			}					
		}
		br.close();
		for (int i = 0 ; i < N ; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(m1[i][j] + m2[i][j]+" ");
				if (j == M-1) {
					System.out.println();
				}
			}
		}
		
//		Integer.parseInt(m1[i]) + Integer.parseInt(m2[i]);
		
//		for (int i = 0 ; i < m1.length ; i++) {
//			System.out.print(m1[i] + " ");
//		}
//		for (int i = 0 ; i < m2.length ; i++) {
//			System.out.print(m2[i] + " ");
//		}
		
//		for (int i = 0 ; i < matrix1.length ; i++) {
//				System.out.println(matrix1[i]);
//		}
//		for (int i = 0 ; i < matrix2.length ; i++) {
//			System.out.println(matrix2[i]);
//		}
		


	}

}
