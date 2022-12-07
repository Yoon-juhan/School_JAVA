import java.util.*;

public class 야구게임 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int[] num = new int[3];
		int[] frq = new int[10];
		int[] call = new int[3];
		int cnt = 0;
		
		// 난수 생성
		for (int i = 0; i < 3; i++) {
				num[i] = rnd.nextInt(9);
				if (frq[num[i]] == 0) {
					frq[num[i]] = 1;
				} else {
					i--;
				}
			}
		System.out.println(Arrays.toString(num));
		while (true) {
			int strike = 0;
			int ball = 0;
			System.out.print("숫자 3자리 입력 : ");
			String n = sc.next();
			for (int i = 0; i <= 2; i++) {
				call[i] = Integer.parseInt(n.substring(i,i+1));
			}
			
			if (num[0] == call[0]) strike++;

			if (num[1] == call[1]) strike++;

			if (num[2] == call[2]) strike++;
			
			if (call[0] == num[1] || call[0] == num[2]) ball++;
			
			if (call[1] == num[0] || call[1] == num[2]) ball++;
			
			if (call[2] == num[0] || call[2] == num[1]) ball++;
			
			System.out.println(strike + " strike" + " " + ball + " ball");
			cnt++;
			
			if (strike == 3) {
				System.out.printf("*** 축하합니다. %d번만에 성공!! ***", cnt);
				break;
			}
		} // while
		
		
	}
}