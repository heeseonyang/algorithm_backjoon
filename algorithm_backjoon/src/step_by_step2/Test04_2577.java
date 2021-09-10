package step_by_step2;

import java.util.Arrays;
import java.util.Scanner;

public class Test04_2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int mul = a*b*c;
		String strNum = Integer.toString(mul); //곱을 스트링으로 변환
		
		for(int i=0; i<10; i++) {
			int count=0;
			for(int j=0; j<strNum.length(); j++) {
				if((strNum.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
