package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2444 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
        StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                sb.append(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                sb.append(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
				
		
//		int given = Integer.parseInt(br.readLine());
//		br.close();
//		int totalLength = given * 2 - 1;	
//		String star = "*";
//		String blank = " ";
//		StringBuffer sb = new StringBuffer();
//		
//		for (int i = 0 ; i < totalLength ; i++) {
//			for (int j = 0 ; j < totalLength ; j++) {
//				if (i <= totalLength/2) {
//					
//					if(i+j <= totalLength/2 -1) {
//						sb.append(blank);
//					} else if (j-i >= totalLength/2 +1) {
//						sb.append(blank);
//					} else {
//						sb.append(star);
//					}
//					
//				} else if (i > totalLength/2) {
//					
//					if (i-j >= totalLength/2 +1) {
//						sb.append(blank);
//					} else if (i+j >= totalLength/2*3 +1) {
//						sb.append(blank);
//					} else {
//						sb.append(star);
//					}
//				}			
//			}
//			sb.append("\n");
//		}	
//		System.out.println(sb.toString());
	}

}
