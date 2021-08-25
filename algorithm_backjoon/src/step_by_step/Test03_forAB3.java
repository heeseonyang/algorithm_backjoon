package step_by_step;

import java.util.Scanner;

public class Test03_forAB3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();//t¹ø Ãâ·Â
		int[]ar = new int[t];
				
		for(int i=0; i<t; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			ar[i] = a+b;
		}
		
		for(int data : ar) {
			System.out.println(data);
		}
		
	}

}
