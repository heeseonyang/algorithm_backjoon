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
		int index = 0;//�ִ밪�� ��ġ�� �˾Ƴ� ��������
		
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>max) {
				max = ar[i];
				index = i+1; //max�� �� ���� ��ġ�� index�� ����
			}
		}
		
		System.out.println(max); //�ִ밪
		System.out.println(index); //�ִ밪��ġ

	}

}