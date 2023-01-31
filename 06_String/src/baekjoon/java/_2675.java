package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2675 {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int a = Integer.parseInt(br.readLine());
		for (int i = 0; i < a ; i++) {
			String[] arr = br.readLine().split(" ");
			int count = Integer.parseInt(arr[0]);
//			String str = arr[1];
			
			for (byte strValue : arr[1].getBytes()) {
				for (int j = 0 ; j < count ; j++) {
					sb.append((char)strValue);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
