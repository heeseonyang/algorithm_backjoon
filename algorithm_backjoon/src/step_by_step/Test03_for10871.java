package step_by_step;

import java.util.Scanner;

//1. 배열을 이용한 방법
public class Test03_for10871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int[]a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}//배열에 숫자를 입력받아서 집어넣음
		
		scan.close(); //scan 쓸 일 없으므로 닫는다.
		
		for(int i=0; i<n; i++) {//크기 비교해서 출력
			if(a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}

	}

}
