package step_by_step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test03_forFastAB3 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine()); //�������
		
		StringTokenizer st ;
		
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());// a,b�� �Է�..string���� �ԷµǴϱ� �ѹ��� �Է¹޾Ƶ��ȴ�.
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())+"\n");
		}
		
		bw.flush();
		bw.close();
		
		
		
	}

}
