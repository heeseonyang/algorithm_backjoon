package step_by_step;

import java.util.Scanner;

//1. �迭�� �̿��� ���
public class Test03_for10871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int[]a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}//�迭�� ���ڸ� �Է¹޾Ƽ� �������
		
		scan.close(); //scan �� �� �����Ƿ� �ݴ´�.
		
		for(int i=0; i<n; i++) {//ũ�� ���ؼ� ���
			if(a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}

	}

}
