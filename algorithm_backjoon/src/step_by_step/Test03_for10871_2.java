package step_by_step;

import java.util.Scanner;

//2.배열을 이용하지 않고 입력받음과 동시에 if문으로 검사해서
//주어진 수보다 작은 경우 StringBuilder에 저장해주는 방법
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
