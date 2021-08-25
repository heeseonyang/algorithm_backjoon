package step_by_step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test03_forAB7 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st ;
		
//		for(int i=0; i<t; i++) {
//			st = new StringTokenizer(br.readLine());
//			bw.write("Case #"+(i+1)+": "+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
//		}
		
		for(int j=0; j<t; j++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write("Case #"+(j+1)+": " + a + " + " + b + " = " + (a+b) +"\n");
		}
		
		
		bw.flush();
		bw.close();
	}
}
