package step_by_step;

import java.util.Scanner;

//2.�迭�� �̿����� �ʰ� �Է¹����� ���ÿ� if������ �˻��ؼ�
//�־��� ������ ���� ��� StringBuilder�� �������ִ� ���
public class Test03_for10871_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			int a = scan.nextInt();
			
			if(a < x) {
				sb.append(a + " ");
			}
		}
		System.out.println(sb);

	}

}
