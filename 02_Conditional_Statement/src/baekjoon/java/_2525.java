package baekjoon.java;
import java.util.Scanner;

public class _2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int cook = + sc.nextInt();
        sc.close();
        
        hour = hour + cook/60 ;
        minute = minute + cook%60;
      
        if (minute >= 60){
          hour = hour + 1;
          minute = minute - 60;
        }
        if (hour > 23){
          hour = hour - 24;
        }
        System.out.println(hour + " " + minute);

	}

}
