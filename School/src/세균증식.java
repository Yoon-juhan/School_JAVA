import java.util.*;

public class 세균증식 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("세균 마리수 : ");
			int number = sc.nextInt();
			System.out.print("경과 시간 : ");
			int time = sc.nextInt();
			int sum = number;
			int cnt = number;
			
			if (1 > number || number > 10) {
				System.out.println("세균 마리수가 범위를 벗어났습니다.");
				break;
				
			} else if (1 > time || time > 15) {
				System.out.println("시간이 범위를 벗어났습니다.");
				break;
			} else {
				for (int i = 1; i <= time; i++) {
					sum += cnt;
					cnt += cnt;
				}
				System.out.printf("%d마리가 %d시간 후에 %d 마리로 번식함\n", number, time, sum);
				System.out.println("--------------------------------");
			}
			
		}
	}
}