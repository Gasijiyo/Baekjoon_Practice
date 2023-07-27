package baekjoon.java;

import java.util.*;

public class _2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = a * b * c;
		String num = Integer.toString(result);			
		sc.close();
		for (int i = 0; i < 10 ; i++) {
			int count = 0;
			for(int j = 0 ; j < num.length(); j++) {
				if ((num.charAt(j) - '0') == i) {
//					char 형 문자를 int 형 정수로 변환하기 위해 '0' 을 뺀다
					count++;
				}				
			}
			System.out.println(count);
		}
		
		
	}

}
