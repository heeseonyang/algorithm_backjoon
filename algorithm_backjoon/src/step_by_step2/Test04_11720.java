package step_by_step2;
//숫자의 합 - 다시
import java.util.Scanner;

public class Test04_11720 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String a = scan.next();
		scan.close();
		
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += a.charAt(i)-'0';
		}

		System.out.println(sum);
	}

}
