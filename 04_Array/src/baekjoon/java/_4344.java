package baekjoon.java;
import java.util.*;

public class _4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int test = sc.nextInt();
		int[] score ;
		
		for (int i = 0; i < test ;i++) {
			int n = sc.nextInt();
			score = new int[n];			
			double total = 0;
			
			for (int j = 0; j < n; j++) {
				int grade = sc.nextInt();
				score[j] = grade;
				total += score[j];
			}
			double avg = total / n ;			
			double count = 0;	// 평균넘는 학생 수
			
			for (int k = 0 ; k < n ; k++) {
				if (score[k] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count/n)*100);
			// 출력문 양식 '%'!
		}	
		sc.close();
	}

}
