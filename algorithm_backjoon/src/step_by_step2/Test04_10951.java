package step_by_step2;

import java.util.Scanner;

//while문 : A + B - 4
public class Test04_10951 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		while(scan.hasNextInt()) { //hasNextInt() : 입력값이 정수일 경우 true를 반환, 정수가 아닐경우 바로 예외를 던지면서 더이상의 입력을 받지 않고 false를 반환하며 반복문 종료시킴
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println(a+b);
			
		}
		scan.close();

	}

}
