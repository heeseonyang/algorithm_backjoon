package step_by_step2;

import java.util.Scanner;

public class test4 {
	
	public static void main(String [] args) {
		 int left;
		 int right;
		 int answer = 0;
	        
	        Scanner scan = new Scanner(System.in);
	        left = scan.nextInt();
	        right = scan.nextInt();
	        
	        int count=0;
	       
	        
	        for(int i=left; i<=right; i++) {//사잇값구하기
	        	System.out.println();
	        	for(int j=1; j<=left; j++) {//각 사잇값의 약수구하기
	        		if(i % j == 0) {
	        			System.out.print(j + " "); //j=약수
	        			count ++ ;
	        		}
 	        	
	        	}
	        	
	        	if(count % 2 ==0) {
	        		answer += i;
	        	}else {
	        		answer -=i;
	        	}
	        	
	        	left++;
	       
	        }
	       
	        
	       
	        
	        
	        System.out.println();
	        System.out.println(answer);
//	        System.out.println(count1);
//	        System.out.println(count2);
//	        System.out.println(sum);
		
		
	}

	

	

}
