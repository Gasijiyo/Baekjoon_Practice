package baekjoon.java;
import java.util.*;

public class _1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 시험의 개수, 시험점수 저장할 배열 선언
		int subject = sc.nextInt();
		double[] score = new double[subject];
		// double[] score = new double[sc.nextInt()];
		
		// 배열에 점수 입력해 저장
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		sc.close();
		
		// 최대값 구하기
		int m = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] > m) {
				m = (int) score[i];
			}			
		}
		
		// 새로운 점수 저장하고 평균값 구하기
		double total = 0;
		for (int j = 0 ; j <score.length ; j++) {
			score[j] = (score[j] / m * 100); 			
			total += score[j];
		}		
	
		System.out.println(total / subject);		
	}

}
