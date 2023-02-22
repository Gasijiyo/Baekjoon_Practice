package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _25314 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int given = Integer.parseInt(br.readLine());
		int quotient = given / 4;
		br.close();
		for (int i = 0 ; i < quotient ; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
		

	}

}
