package step_by_step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//배열 최소, 최대
public class Test05_10818 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int i = 0;
		int[] ar = new int[n];
		
		while(st.hasMoreTokens()) {
			ar[i] = Integer.parseInt(st.nextToken());
			i ++;
		}
		
		Arrays.sort(ar);
		System.out.println(ar[0] + " " + ar[n-1]);
		
	
	}
}
