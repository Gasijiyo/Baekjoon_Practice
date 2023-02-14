package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2908 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int a_1 = a % 10;
		int a_10 = (a / 10)%10;
		int a_100 = a / 100;
		
		int b_1 = b % 10;
		int b_10 = (b / 10)%10;
		int b_100 = b / 100;
		
		int a_reverse = a_1*100 + a_10*10 + a_100;
		int b_reverse = b_1*100 + b_10*10 + b_100;
		
		if (a_reverse > b_reverse) {
			System.out.println(a_reverse);
		} else {
			System.out.println(b_reverse);
		}
		br.close();
	}

}
