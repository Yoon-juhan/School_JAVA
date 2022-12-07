import java.util.*;

public class 문자열자르기프로그램 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("문자열 입력 : ");
			String my_str = sc.next();
			System.out.print("자를 문자개수 : ");
			int n = sc.nextInt();
			String[] short_str;
			
			if ((1 <= my_str.length() && my_str.length() <= 100) && (1 <= n && n <= my_str.length())) {
				int len = my_str.length() / n;
				
				if (my_str.length() % n == 0) {
					short_str = new String[len];
				} else {
					short_str = new String[len+1];			
				}
				int start = 0;
				int end = n;
				
				for (int i = 0; i < short_str.length-1; i++) {
					short_str[i] = my_str.substring(start, end);
					start += n;
					end += n;
				}
				
				short_str[short_str.length-1] = my_str.substring(start);

				System.out.print("분리된 문자열 : [");
				for(int i = 0; i <= short_str.length-1; i++) {
					if (i != short_str.length-1) {
						System.out.printf("\"%s\", ", short_str[i]);				
					} else {
						System.out.printf("\"%s\"]", short_str[i]);
					}
				}
				System.out.println();
				System.out.println("------------------------------------");
			} else {
				System.out.println("잘못된 입력으로 프로그램 종료");
				break;
			}
			
		} // while
	}
}