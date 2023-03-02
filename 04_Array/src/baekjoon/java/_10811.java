package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10811 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] basket = new int[N];

		for (int i = 0; i<N ; i++) {
			basket[i] = i+1;	// 1 2 3 4 5
		}
				
		int temp = 0;
		for (int a = 0 ; a < M ; a++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken()) -1;
			int j = Integer.parseInt(st.nextToken()) -1;
			
			while (i < j) {
				temp = basket[i];
				basket[i++] = basket[j];
				basket[j--] = temp;
			}		
		}
		
		br.close();
		for (int i=0 ; i < N ; i++) {			
			System.out.print(basket[i] + " ");
		}
	}
//	21345  21435  34125
}
