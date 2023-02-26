package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10810 {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] basket = new int[n];
		
		for (int i = 0 ; i < n ; i++) {
			basket[i] = 0;
		}
		
		for (int ii = 1 ; ii <= m ; ii++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			for (int a = i; a <= j ; a++) {
				basket[a-1] = k;
			}
		}
		
		for (int a = 0; a < basket.length ; a++) {
			System.out.print(basket[a] + " ");
		}
//		System.out.println("n: " + n + " m: " + m);		
		br.close();		
	}	
}
