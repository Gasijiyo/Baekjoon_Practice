package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10798 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] input = new char[5][15];
		int max = 0;
		for (int i = 0;  i < 5; i++) {
			String str = br.readLine();
			if(max < str.length()) max = str.length();
			for (int j = 0 ; j < str.length() ; j++) {				
				input[i][j] = str.charAt(j);
			}
		}
		br.close();
		for (int i = 0 ; i < max ; i++) {	// max 또는 15
			for (int j = 0; j<5 ; j++) {
				if (input[j][i]=='\0') continue; // char의 초기값은 '\0'					
				System.out.print(input[j][i]);
			}
		}		
	}

}
