package baekjoon.java;
import java.util.*;

public class _3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
		// HashSet는 원소가 중복될 경우 하나만 저장한다.
		// 순서가 없다. sort()를 쓸 수 없다. 하려면 리스트로 변환 후 사용가능.
		for (int i = 0; i < 10 ; i++) {
			hs.add(sc.nextInt() % 42);
		}
		sc.close();
		
		System.out.println(hs.size());
		// 당연히 중복안된 값만 저장되므로 크기만 구하면 중복값이 아닌 개수가 나온다
	}

}
