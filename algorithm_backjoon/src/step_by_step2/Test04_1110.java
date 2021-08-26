package step_by_step2;

import java.util.Scanner;

//더하기 사이클
public class Test04_1110 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int sum;
		int result = n;
		int count=0;
		
//		n의1 : (n%10)*10
//		sum의 1 : ((n/10)+(n%10))%10
//		n = ((n%10)*10) + ((n/10)+(n%10))%10
		
		do {
			n = ((n%10)*10) + ((n/10)+(n%10))%10;
			count++;
			
		}while(result != n); //n과 result가 같지 않으면 멈춰라
		
		System.out.println(count);
		

	}

}
