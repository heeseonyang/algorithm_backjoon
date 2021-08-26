package step_by_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//3.BufferedReader�� ����ϴ� ���
public class Test03_for10871_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()); // ù° �ٿ� ����� n��x �Է��ؾ��ϴϱ�

		int n = Integer.parseInt(st.nextToken()); // ù��°������ �ҷ���
		int x = Integer.parseInt(st.nextToken()); // �ι�° ������ �ҷ���

		StringBuilder sb = new StringBuilder(); // ��Ʈ�� ������ �̵� �����ҰŰ�

		st = new StringTokenizer(br.readLine()); // �ι�° �ٿ� �� ����� ���������Ŷ� ��Ʈ����Ŀ �� �������

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken()); // ���� �Է¹ް� ��ū���� �����Ѵ�

			if (a < x) {// ������ ���� x���� ũ�⸦ ���Ѵ�
				sb.append(a + " ");
			}
		}
		System.out.println(sb);

	}

}
