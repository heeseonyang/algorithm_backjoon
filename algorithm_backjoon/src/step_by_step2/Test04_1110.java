package step_by_step2;

import java.util.Scanner;

//���ϱ� ����Ŭ
public class Test04_1110 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int sum;
		int result = n;
		int count=0;
		
//		n��1 : (n%10)*10
//		sum�� 1 : ((n/10)+(n%10))%10
//		n = ((n%10)*10) + ((n/10)+(n%10))%10
		
		do {
			n = ((n%10)*10) + ((n/10)+(n%10))%10;
			count++;
			
		}while(result != n); //n�� result�� ���� ������ �����
		
		System.out.println(count);
		

	}

}
