package baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_9498 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        
        if (score >89){
            System.out.println("A");
        } else if (score >79){
            System.out.println("B");
        } else if (score >69){
            System.out.println("C");
        } else if (score>59){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
	}

}
