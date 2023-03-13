package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27866 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String given = br.readLine();
		int i = Integer.parseInt(br.readLine());
		
		String s = String.valueOf(given.charAt(i-1));
		System.out.println(s);
		br.close();
	}

}
