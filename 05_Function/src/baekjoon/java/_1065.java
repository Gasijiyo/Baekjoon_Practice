package baekjoon.java;

import java.util.Scanner;

public class _1065 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner (System.in);
	        int N = sc.nextInt();
	        int result = getHanSu(N);
	        System.out.println(result);
	    } //ebd main
	     
	    public static int getHanSu (int N){
	        int cnt = 0;
	        if (N < 100) {
	            return N;
	        } else {
	            for (int i = 100; i <= N ; i++){                 
	                int h = (i/100);
	                int t = (i/10)%10;
	                int o = (i%10); 
	                if ((h-t) == (t-o)){
	                    cnt++;
	                }                 
	            }            
	        }
	        return cnt + 99;
	    }//end getHanSu 
}
