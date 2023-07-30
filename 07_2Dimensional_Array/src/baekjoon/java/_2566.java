package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2566 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int maxNum = 0;
		int input[][] = new int[9][9];
		for (int i = 0 ; i < 9 ; i++) {
			st = new StringTokenizer(br.readLine());			
			for (int j = 0; j< 9 ; j++) {
				input[i][j] = Integer.parseInt(st.nextToken());
			}			
		}
		br.close();
		int a = 0;
		int b = 0;
		for (int i = 0; i < 9 ; i++) {
			for (int j = 0 ; j < 9 ; j++) {				
				if (input[i][j] > maxNum) {
					maxNum = input[i][j];
					a = i+1;
					b = j+1;
				}
			}
		}		
		System.out.println(maxNum);
		System.out.print(a+" "+b);
	}
}
