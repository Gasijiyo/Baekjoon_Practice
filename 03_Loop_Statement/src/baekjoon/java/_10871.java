package baekjoon.java;
import java.util.Scanner;

public class _10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);            
        int N = sc.nextInt();
        int X = sc.nextInt();
        sc.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<N; i++){
            int A = sc.nextInt();
            if (A < X) {
                sb.append(A + " ");
            }
        }
        System.out.print(sb);

	}

}
