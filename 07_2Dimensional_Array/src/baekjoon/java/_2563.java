package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2563 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[][] area = new boolean[101][101];
		int n = Integer.parseInt(br.readLine());
		int total = 0;
		for (int i = 0 ; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for (int a = x; a < x+10; a++) {
				for (int b = y ; b < y+10 ; b++) {
					if(!area[a][b]) {
						area[a][b] = true;
						total++;
					}
				}
			}
		}
		System.out.println(total);
		
		
		
	}
}
