import java.util.*;

public class 가위바위보 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random rnd = new Random();
		
		int cnt = 0;
		int com_cnt = 0;
	
		while (cnt != 3 && com_cnt != 3) {
			System.out.print("사용자 선택[1:가위, 2:바위, 3:보]: ");
			int user = sc.nextInt();
			int com = rnd.nextInt(3)+1;
			System.out.printf("-컴퓨터: %d\n", com);
			System.out.printf("-사용자: %d\n", user);
			
			if (user > 3) {
				System.out.println("다시 선택하세요.");
			}
			if (user == com) {
				System.out.println("비겼습니다.");
			} else if (user == 1) {
				if (com == 2) {
					System.out.println("졌습니다.");
					com_cnt++;
				} else {
					System.out.println("이겼습니다.");
					cnt ++;
				} 
			} else if (user == 2) {
				if (com == 1) {
					System.out.println("이겼습니다.");
					cnt ++;
				} else {
					System.out.println("졌습니다.");
					com_cnt++;
				}
			} else if (user == 3) {
			if (com == 1) {
				System.out.println("졌습니다.");
				com_cnt++;
			} else {
				System.out.println("이겼습니다.");
				cnt ++;
			}
			}
			System.out.printf("<사용자> %d점 : %d점 <컴퓨터>\n", cnt, com_cnt);
			System.out.println("---------------------------------");
		} // 반복문 끝
		if (cnt == 3) System.out.println("@@@@@ 사용자 승리 @@@@@");
		if (com_cnt == 3) System.out.println("@@@@@ 컴퓨터 승리 @@@@@");
	}
}