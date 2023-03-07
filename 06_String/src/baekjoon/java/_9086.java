package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _9086 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t ; i++) {
//			st = new StringTokenizer(br.readLine());
			String s = br.readLine();
			System.out.println(String.valueOf(s.charAt(0))+String.valueOf(s.charAt(s.length()-1)) );
//			System.out.println(s.substring(0, 1)+s.substring(s.length()-1));
		}
		br.close();
	}

}
