package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10998 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String given = br.readLine();
		System.out.println(given);
		br.close();
		String[] given_CharAt = new String[given.length()];
		String result = "";
		for (int i = 0; i < given_CharAt.length;i++) {
			given_CharAt[i] = Character.toString(given.charAt(i));
		}
		
		for (int j = given_CharAt.length-1; j>=0 ; j--) {
			result += given_CharAt[j]; 
		}
		System.out.println(result);
		
		if (given.equals(result)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		

	}

}
