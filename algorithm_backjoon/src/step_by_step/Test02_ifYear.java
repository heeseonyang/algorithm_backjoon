package step_by_step;

import java.util.Scanner;

//������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
//���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 
//1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. ������, 2000���� 400�� ����̱� ������ �����̴�.

public class Test02_ifYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		
		if(y%4 == 0 && y%100 !=0 || y%400==0) {
			System.out.println("1");
		}else{
			System.out.println("0");
		}
	}

}