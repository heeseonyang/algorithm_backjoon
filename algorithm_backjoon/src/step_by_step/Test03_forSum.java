package step_by_step;

import java.util.Scanner;

public class Test03_forSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum =0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
