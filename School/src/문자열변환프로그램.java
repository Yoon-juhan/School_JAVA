import java.util.*;

public class 문자열변환프로그램 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		byte[] byte_arr;
		
		String result_1;

		System.out.print("문자열 입력 : ");
		String str = sc.next().toLowerCase();
		
		byte_arr = str.getBytes();
		Arrays.sort(byte_arr);
		
		result_1 = new String(byte_arr);
		System.out.println("변환된 문자열 : " + result_1);
	}
}