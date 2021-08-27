package step_by_step2;

import java.util.Scanner;

public class Test04_2562 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] ar = new int[9];
		
		for(int i =0; i<ar.length; i++) {
			ar[i] = scan.nextInt();
			
		}
		
		int max = ar[0];
		int index = 0;//최대값의 위치를 알아낼 변수생성
		
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>max) {
				max = ar[i];
				index = i+1; //max가 된 값의 위치를 index에 저장
			}
		}
		
		System.out.println(max); //최대값
		System.out.println(index); //최대값위치

	}

}