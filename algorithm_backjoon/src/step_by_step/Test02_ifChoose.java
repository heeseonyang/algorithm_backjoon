package step_by_step;

import java.util.Scanner;

public class Test02_ifChoose {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		for(int i=1; i<a+1; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i * j +"="+ (i*j));
			}
			
		}
	}

}
