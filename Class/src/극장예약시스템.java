import java.util.*;

public class 극장예약시스템 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] freq = new int[11];
		boolean b = true;
		
		while (b) {
			System.out.println("--------------------------------");
			System.out.println(" 1  2  3  4  5  6  7  8  9  10 ");
			System.out.println("--------------------------------");
			for (int i = 0; i < freq.length-1; i++) {
				System.out.printf(" %d ", freq[i]);
			}
			System.out.println();
			System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1): ");
			int n = sc.nextInt();
			if (n == -1) {
				b = false;
				System.out.println("프로그램 종료");
			} else if (0 >= n || n > 10) {
				System.out.println("1 ~ 10 사이의 수를 입력해주세요.");
			} else if (freq[n-1] != 0) {
				System.out.println("이미 예약된 자리입니다.");
			} else {
				System.out.println("예약되었습니다.");
				freq[n-1]++;
			}
			System.out.println();
		}
		
	}
}