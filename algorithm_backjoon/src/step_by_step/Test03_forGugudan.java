package step_by_step;

import java.util.Scanner;

public class Test03_forGugudan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for(int i=1; i<=9; i++) {
			System.out.println(n +" * "+ i +" = "+(n*i));
		}
	}
}
