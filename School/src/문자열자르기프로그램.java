import java.util.*;

public class 문자열자르기프로그램 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String my_str = sc.next();
		System.out.print("자를 문자개수 : ");
		int n = sc.nextInt();
		int len = my_str.length() / n;		
		String[] short_str = new String[len+1];
		
		for (int i = 0; i <= my_str.length();) {
			if (i < my_str.length()) {
				System.out.println(my_str.substring(i,i+n));
				i += n;
			} else if (i > my_str.length()) {
				System.out.println(my_str.substring(i,-1));
			}
		}
	}
}