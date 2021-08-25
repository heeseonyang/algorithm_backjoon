package step_by_step;

import java.util.Scanner;

public class Test02_ifScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(90<=score) {
			System.out.println("A");
		}else if(80<=score) {
			System.out.println("B");
		}else if(70<=score) {
			System.out.println("C");
		}else if(60<=score) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
//		switch(score/10) {
//		case 10 :
//			System.out.println("A");
//			break;
//		case 9 :
//			System.out.println("A");
//			break;
//		case 8 :
//			System.out.println("B");
//			break;
//		case 7 :
//			System.out.println("C");
//			break;
//		case 6 :
//			System.out.println("D");
//			break;
//		default :
//			System.out.println("F");
//			break;
//			
//		}
	}

}
