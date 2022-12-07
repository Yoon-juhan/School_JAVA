import java.util.*;

public class 랩퍼클래스 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		System.out.print("더할 숫자 두개 입력 : ");
		String s1 = sc.next();
		String s2 = sc.next();
		
		sum += Integer.parseInt(s1);
		sum += Integer.parseInt(s2);
		System.out.println(s1 + " + " + s2 + " = " + sum);
		System.out.println("이진수 : " + Integer.toBinaryString(sum));
	}
}