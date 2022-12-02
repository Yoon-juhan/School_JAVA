import java.util.*;

public class 주소록 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] nameArr = new String[10];
		String[] phoneArr = new String[10]; 
		boolean exit = true;
		int i = 0;
		
		while(exit) {
			System.out.println("===== 간단한 주소록 메뉴 =====");
			System.out.println("1. 등록\n2. 검색\n3. 출력\n4. 종료");
			System.out.println("=========================");
			System.out.print("- 메뉴 선택 : ");
			int menu = sc.nextInt();
			System.out.println();
			
			switch (menu) {
			case 1:
				System.out.println("===== 주소록 등록 =====");
				System.out.print("- 등록할 이름 : ");
				nameArr[i] = sc.next();
				System.out.print("- 등록할 전화번호 : ");
				phoneArr[i] = sc.next();
				i++;
				break;
			case 2:
				System.out.println("===== 주소록 검색 =====");
				System.out.print("- 검색할 이름 : ");
				String search = sc.next();
				for (int j = 0; j < i; j++) {
					if (nameArr[j].equals(search)) {
						System.out.printf("- %s 전화번호 : %s\n", search, phoneArr[j]);
					}
				}
				break;
			case 3:
				System.out.println("===== 주소록 출력 =====");
				for (int j = 0; j < i; j++) {
					System.out.println(nameArr[j] + " " + phoneArr[j]);
				}
				break;
			case 4:
				exit = false;
			}
			System.out.println();
		}
		
	}

}
