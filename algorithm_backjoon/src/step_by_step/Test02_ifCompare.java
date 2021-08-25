package step_by_step;

import java.util.Scanner;

public class Test02_ifCompare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a>b) {
			System.out.println(">");
		}else if(a<b) {
			System.out.println("<");
		}else if(a==b) {
			System.out.println("==");
		}
	}

}
