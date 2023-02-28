package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10813 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] basket = new int[n];
		for (int i = 0; i < n ; i++) {
			basket[i] = i+1;
		}		
		
		for (int i = 0 ; i < m ; i++) {
			st = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			int temp = basket[I-1];
			basket[I-1] = basket[J-1];
			basket[J-1] = temp; 
		}
		
		for (int a : basket) {
			System.out.print(a + " ");
		}
		br.close();
		
	}

}
