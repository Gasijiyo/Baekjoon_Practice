package baekjoon.java;

import java.util.Scanner;

public class _2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        
        if (a == b && a == c){
            int prize = 10000 + a*1000;
            System.out.println(prize);
            
        } else if (a==b || a==c) {
            int prize = 1000+a*100;
            System.out.println(prize);
            
        } else if (b==c){
            int prize = 1000+b*100;
            System.out.println(prize);
            
        } else if (a > b && a > c) {
            int prize = a*100;
            System.out.println(prize);
            
        } else if (b>a && b>c){
           int prize = b*100;
            System.out.println(prize); 
            
        } else if (c>a && c>b){
            int prize = c*100;
            System.out.println(prize);
        }

	}

}
