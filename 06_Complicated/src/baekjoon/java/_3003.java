package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3003 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String given = br.readLine();
		String[] givenArray = given.split(" ");
		int[] chess = {1,1,2,2,2,8};		
		br.close();
		for (int i = 0; i < givenArray.length ; i++) {
			int given_i = Integer.parseInt(givenArray[i]);
			System.out.print(chess[i]-given_i + " ");
		}
		
		
	}

}
