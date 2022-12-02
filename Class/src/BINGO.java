import java.util.*;

public class BINGO {

	public static void main(String[] args) throws InterruptedException {

		Random rnd = new Random();

		int[][] bingo = new int[5][5]; // 빙고판
		int[] bingo_fre = new int[26]; // 빙고판에 들어갈 숫자 중복되지 않게 빈도 배열
		int[] select_fre = new int[26]; // 선택한 숫자 중복되지 않게 빈도 배열
		int[] select_num = new int[25];
		int[] row_fre = new int[5]; // 가로 빙고가 완성되면 나오지 않게 하기위한 배열
		int[] col_fre = new int[5]; // 가로 빙고가 완성되면 나오지 않게 하기위한 배열
		int[] dia_fre = new int[2]; // 대각선 빙고가 완성되면 나오지 않게 하기위한 배열
		int num;
		boolean bool = true;
		int bingo_count = 0; // 완성된 줄 개수 세기
		int count = 0;
		int sum = 0;

		// 1~25의 수 생성
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				num = rnd.nextInt(25) + 1;
				if (bingo_fre[num] == 0) {
					bingo_fre[num] = 1;
					bingo[i][j] = num;
				} else {
					j--;
				}
			}
		}

		// 5 * 5 형태로 출력
		System.out.println("--------------------------");
		for (int i = 0; i < bingo.length; i++) {
			System.out.print("|");
			for (int j = 0; j < bingo[i].length; j++) {
				System.out.printf(" %-2d |", bingo[i][j]);
			}
			System.out.println();
			System.out.println("--------------------------");
		}

		// 숫자 선택 후 나온 숫자를 ★로 출력
		while (bool) {
			int select = rnd.nextInt(25) + 1; // 랜덤 값 선택
			while (select_fre[select] == 1) { // 이미 나온 값이 또 나오면 안나온 값이 나올때 까지 다시 선택, 빈도 배열 값이 다 1이면 무한 반복되지만 그전에 프로그램
												// 종료됨.
				select = rnd.nextInt(25) + 1;
			}
			if (select_fre[select] == 0) { // 새로운 값이 나오면 실행
				select_fre[select] = 1; // 이 값이 나오지 않게 빈도 배열 1로 변경
				select_num[count] = select;
				count++;
				System.out.println("--------------------------");
				for (int i = 0; i < bingo.length; i++) {
					System.out.print("|");
					for (int j = 0; j < bingo[i].length; j++) {
						if (bingo[i][j] == select) {
							bingo[i][j] = 0;
						}
						if (bingo[i][j] == 0) {
							System.out.printf(" %-2s |", "★");
						} else {
							System.out.printf(" %-2d |", bingo[i][j]);
						}
					}
					System.out.println();
					System.out.println("--------------------------");
				}
			} else {
				continue;
			}
			// 가로 빙고
			for (int i = 0; i < bingo.length; i++) {
				if (row_fre[i] == 1) {
					continue;
				}
				for (int j = 0; j < bingo[i].length; j++) {
					sum += bingo[i][j];
				}
				if (sum == 0) {
					bingo_count++;
					row_fre[i] = 1;
				}
				sum = 0;
			}
			// 세로 빙고
			for (int i = 0; i < bingo.length; i++) {
				if (col_fre[i] == 1) {
					continue;
				}
				for (int j = 0; j < bingo[i].length; j++) {
					sum += bingo[j][i];
				}
				if (sum == 0) {
					bingo_count++;
					col_fre[i] = 1;
				}
				sum = 0;
			}
			// 대각선 빙고
			for (int i = 0; i <= 1; i++) { // 두 번만 반복 \ 일때, / 일때
				if (dia_fre[i] == 1) {
					continue;
				}
				if (i == 0) {
					for (int j = 0; j < bingo[i].length; j++) {
						sum += bingo[j][j];
					}
				} else { // i = 4 일때
					for (int j = 0, k = 4; j < bingo[i].length; j++, k--) {
						sum += bingo[j][k];
					}
				}
				if (sum == 0) {
					bingo_count++;
					dia_fre[i] = 1;
				}
				sum = 0;
			}

			System.out.print("선택된 수 : ");
			for (int i = 0; i < count; i++) {
				System.out.print(select_num[i] + " ");
			}

			if (bingo_count >= 3) {
				bool = false;
				System.out.printf("(%d번째 빙고!)", count);
			}
			System.out.println();
			Thread.sleep(10); // 1초 멈춤 1000ms = 1s
		} // while 끝
	}
}