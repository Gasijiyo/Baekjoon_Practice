package baekjoon.java;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;	
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class _15552 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T ; i++) {
			String s = br.readLine();
			int a = Integer.parseInt(s.split(" ")[0]);
			int b = Integer.parseInt(s.split(" ")[1]);
			bw.write(a + b + "\n");
			
		}
		
		bw.flush();
		
	}

}
