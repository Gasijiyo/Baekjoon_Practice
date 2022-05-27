package baekjoon.java;
import java.util.*;

public class _8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		String s;
		
		for (int i = 0; i < test ; i++) {
			s = sc.next();
			int cnt = 0, sum = 0;
			
			
			for (int j = 0; j<s.length(); j++) {
				if (s.charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}		
		sc.close();
	}

}
