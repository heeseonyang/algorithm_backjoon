package step_by_step2;

import java.util.Scanner;

public class Test04_2562 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[]ar =  {scan.nextInt(), scan.nextInt(),scan.nextInt(),
					scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),
					scan.nextInt(),scan.nextInt()};
		scan.close();
		
		int max=0;
		int index=0;
		int count = 0;
		
		for(int value : ar) {
			count++;
			if(value > max) {
				max = value;
				index = count;
			}
		}
	
		System.out.println(max + "\n" + index);

	}

}