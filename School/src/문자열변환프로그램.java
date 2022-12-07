import java.util.*;

public class 문자열변환프로그램 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		byte[] byte_arr;
		
		String result_1;

		while (true) {
			System.out.print("문자열 입력 : ");
			String str = sc.next().toLowerCase();
			// 소문자로 변환해서 입력받음

			if (str.equals("0")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				// 문자열을 바이트형태 배열로 변환
				byte_arr = str.getBytes();
				Arrays.sort(byte_arr);
				
				// 바이트 배열을 문자열로 변환
				result_1 = new String(byte_arr);
				System.out.println("변환된 문자열 : " + result_1);
				System.out.println("---------------------------------");
			}
		}
	}
}