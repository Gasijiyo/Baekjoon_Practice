package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[26];
		String s = br.readLine();

		for (int i = 0; i < s.length(); i++) {
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
				arr[s.charAt(i) - 97]++;
			} else {
				arr[s.charAt(i) - 65]++;
			}
		}
		int max = -1;
		char ch = '?';
		for (int i = 0; i < 26; i++) {

			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			} else if (arr[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);
		
//		Scanner input = new Scanner(System.in);
//        int apb[] = new int[26]; // A~Z까지 0~25에 각각 나온 횟수를 저장할 배열 초기화
//        String str = input.next(); // 단어 입력
//        str = str.toUpperCase(); // 단어가 대소문자 섞여서 입력되므로 대문자로 모두 전환(소문자로 전환해도 무관)
//        for(int i=0; i<str.length(); i++){
//            apb[str.charAt(i)-'A']++; // 나온 단어에 해당하는 인덱스의 정수 값을 1씩 증가시킨다
//        }
//        int max = 0, ans=0;
//        for(int i=0; i<apb.length; i++){
//            if(max < apb[i]){ // 지금까지 나온 최빈값이랑 현재 인덱스의 저장된 값이랑 비교(가장 많이 사용된 알파벳 찾는 조건문)
//                max = apb[i];
//                ans = i;
//            }
//            else if(max == apb[i]){ // 지금까지 나온 최빈값이랑 현재 인덱스의 저장된 값이 같은지 확인(최빈값이 2 이상이면 "?"출력해야함)
//                ans = -2; // ascii코드에서 ?는 A보다 2가 작기 때문
//            }
//        }
//        System.out.printf("%s", Character.toString(ans+'A')); // 결과값 출력
		
	}
}
