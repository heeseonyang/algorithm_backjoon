package step_by_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//3.BufferedReader를 사용하는 방법
public class Test03_for10871_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()); // 첫째 줄에 띄어쓰기로 n과x 입력해야하니까

		int n = Integer.parseInt(st.nextToken()); // 첫번째데이터 불러옴
		int x = Integer.parseInt(st.nextToken()); // 두번째 데이터 불러옴

		StringBuilder sb = new StringBuilder(); // 스트링 빌더로 이따 연결할거고

		st = new StringTokenizer(br.readLine()); // 두번째 줄에 또 띄어쓰기로 구분지을거라 스트링토커 또 만들어줘

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken()); // 수열 입력받고 토큰으로 구분한다

			if (a < x) {// 수열의 수와 x값의 크기를 비교한다
				sb.append(a + " ");
			}
		}
		System.out.println(sb);

	}

}
