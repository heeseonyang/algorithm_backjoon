package step_by_step2;

import java.util.Scanner;

//while�� : A + B - 4
public class Test04_10951 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		while(scan.hasNextInt()) { //hasNextInt() : �Է°��� ������ ��� true�� ��ȯ, ������ �ƴҰ�� �ٷ� ���ܸ� �����鼭 ���̻��� �Է��� ���� �ʰ� false�� ��ȯ�ϸ� �ݺ��� �����Ŵ
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println(a+b);
			
		}
		scan.close();

	}

}
