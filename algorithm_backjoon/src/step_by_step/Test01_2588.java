package step_by_step;

import java.util.Scanner;

public class Test01_2588 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		String b = scan.next();
		
		System.out.println(a * (b.charAt(2)-'0'));
		System.out.println(a * (b.charAt(1)-'0'));
		System.out.println(a * (b.charAt(0)-'0'));
		System.out.println(a * Integer.parseInt(b));
		
	}
}