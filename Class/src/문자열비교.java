import java.util.*;

public class 문자열비교 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		while (true) {
			System.out.print("문자열을 입력하세요> ");
			str = sc.next();
			if (str.equals("quit")) {
				break;
			}
			// www.문자 한개 이상오면 true
			if (str.matches("^www\\.(.+)")) {
				System.out.println(str + "은 'www'로 시작합니다.");
			} else {
				System.out.println(str + "은 'www'로 시작하지 않습니다.");
			}
		}
		
	}
}